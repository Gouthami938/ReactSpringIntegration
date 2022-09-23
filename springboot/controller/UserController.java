package com.example.springboot.controller;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("api/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }


    @PostMapping("/save_user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


}
