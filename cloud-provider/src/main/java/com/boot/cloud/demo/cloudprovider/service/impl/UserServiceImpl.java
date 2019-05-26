package com.boot.cloud.demo.cloudprovider.service.impl;

import com.boot.cloud.demo.cloudprovider.domain.UserInfo;
import com.boot.cloud.demo.cloudprovider.mapper.UserMapper;
import com.boot.cloud.demo.cloudprovider.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenyu
 * @time 2019/5/25 16:23
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserInfo getUser(Integer userId) {
        return userMapper.getUserById(userId);
    }
}
