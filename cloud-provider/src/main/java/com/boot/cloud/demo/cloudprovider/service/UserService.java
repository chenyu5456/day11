package com.boot.cloud.demo.cloudprovider.service;

import com.boot.cloud.demo.cloudprovider.domain.UserInfo;

/**
 * @author chenyu
 * @time 2019/5/25 16:22
 */
public interface UserService {
    UserInfo getUser(Integer userId);
}
