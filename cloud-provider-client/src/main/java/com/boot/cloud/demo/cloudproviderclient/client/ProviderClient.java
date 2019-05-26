package com.boot.cloud.demo.cloudproviderclient.client;

import com.boot.cloud.demo.cloudproviderclient.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

/**
 * @author chenyu
 * @time 2019/5/26 0:03
 */
@FeignClient(value = "provider", fallback = ProviderClient.ProviderClientFallBack.class)
public interface ProviderClient {
    @GetMapping("user/{id}")
    public UserVo getUserData(@PathVariable("id") Integer userId);

    @Component
    static class ProviderClientFallBack implements ProviderClient {
        @Override
        public UserVo getUserData(Integer userId) {
            UserVo userVo = new UserVo();
            userVo.setUserId(9999);
            userVo.setUserBirth(new Date());
            userVo.setUserAge(1);
            userVo.setUserName("断开");
            return userVo;
        }
    }
}
