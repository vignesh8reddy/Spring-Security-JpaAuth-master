package com.example.demo;

import com.example.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String home() {
        return("<h1>welcome</h1>");
    }
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome user</h1>");
    }
    @GetMapping("/admin")
    public String admin() {
        return("<h1>Welcome admin</h1");
    }
    @PostMapping("/addUser")
    public String addUser( @RequestBody User user){
        System.out.println(user.toString());
    }

}
