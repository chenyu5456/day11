package com.boot.cloud.demo.cloudprovider.controller;

import com.boot.cloud.demo.cloudprovider.domain.UserInfo;
import com.boot.cloud.demo.cloudprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyu
 * @time 2019/5/25 16:24
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public UserInfo getUser(@PathVariable("id") Integer userId){
        return userService.getUser(userId);
    }
}
