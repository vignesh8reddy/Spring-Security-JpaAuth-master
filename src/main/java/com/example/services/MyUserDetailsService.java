package com.example.services;

import com.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    MyUserRepository myUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = myUserRepository.findUserByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User 404");
        } else {
            UserDetails userDetails = new MyUserDetails(user);
            return userDetails;
        }
    }
}
