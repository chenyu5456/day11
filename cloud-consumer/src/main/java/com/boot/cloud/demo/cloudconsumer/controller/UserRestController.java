package com.boot.cloud.demo.cloudconsumer.controller;

import com.boot.cloud.demo.cloudconsumer.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenyu
 * @time 2019/5/25 18:50
 */
@RestController
public class UserRestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("warp/user/{id}")
    public UserVo getUser(@PathVariable("id")Integer userId){
        return restTemplate.getForObject("http://provider/user/" + userId, UserVo.class);
    }
}
