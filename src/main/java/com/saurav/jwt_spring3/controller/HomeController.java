package com.saurav.jwt_spring3.controller;

import com.saurav.jwt_spring3.entity.CustomUser;
import com.saurav.jwt_spring3.services.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private CustomUserService customUserService;

    @GetMapping("/users")
    public List<CustomUser> getUsers(){
        System.out.println("Fetching users");
        return this.customUserService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
