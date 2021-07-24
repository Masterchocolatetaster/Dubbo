package com.bjpowernode.serviceImpl;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;

import java.util.UUID;

public class UserServiceImpl implements UserService {
    public User createUser(String name, String address) {
        User user = new User();
        user.setUserID(UUID.randomUUID().toString());
        user.setAddress(address);
        user.setName(name);
        return user;
    }
}
