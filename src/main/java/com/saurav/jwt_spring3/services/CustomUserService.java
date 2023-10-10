package com.saurav.jwt_spring3.services;

import com.saurav.jwt_spring3.entity.CustomUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CustomUserService {
    private List<CustomUser> userList=new ArrayList<>();

    public CustomUserService() {
        this.userList.add(new CustomUser(UUID.randomUUID().toString(), "Saurav", "saurav@gmail.com"));
        this.userList.add(new CustomUser(UUID.randomUUID().toString(), "abc", "abc@gmail.com"));
        this.userList.add(new CustomUser(UUID.randomUUID().toString(), "xyz", "xyz@gmail.com"));
    }

    public List<CustomUser> getUsers(){
        return this.userList;
    }

}
