package com.app.ecom;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();
    private Long customId= 1L;

    public List<User> fetchAllUsers(){

        return userList;
    }

    public User fetchUser(Long id){

        for (User user : userList ){
            if (user.getId().equals(id)){

             return user;
            }
        }
        return null;

    }

    public List<User> addUser(User keepEyeOnMe){

        keepEyeOnMe.setId(customId++);
        userList.add(keepEyeOnMe);
        return userList;
    }
}
