package com.example.services;

import com.example.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository  extends JpaRepository<User,Long> {
    User findUserByUserName(String username);
}
