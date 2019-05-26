package com.boot.cloud.demo.cloudprovider.mapper;

import com.boot.cloud.demo.cloudprovider.domain.UserInfo;

/**
 * @author chenyu
 * @time 2019/5/25 16:16
 */
public interface UserMapper {
    UserInfo getUserById(Integer userId);
}
