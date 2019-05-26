package com.boot.cloud.demo.cloudconsumer.controller;

import com.boot.cloud.demo.cloudproviderclient.client.ProviderClient;
import com.boot.cloud.demo.cloudproviderclient.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenyu
 * @time 2019/5/25 18:46
 */
@RestController
public class UserFeignController {
    @Resource
    private ProviderClient userClient;

    // 调用只有一个或者多个服务实例API的情况下
    @GetMapping("feign/user/{id}")
    public UserVo getUserData(@PathVariable("id") Integer userId){
        return userClient.getUserData(userId);
    }
    // 调用只有一个或者多个服务实例API的情况下
   /* @GetMapping("feign/user1/{id}")
    public UserVo getUserData2(@PathVariable("id") Integer userId, @RequestParam("token") String token, HttpServletResponse response){
        Cookie cookie = new Cookie("token", token);
        cookie.setPath("/");
        cookie.setMaxAge(1000*60);
        response.addCookie(cookie);
        return userClient.getUserData(userId);
    }*/

}
