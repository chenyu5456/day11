package com.boot.cloud.demo.cloudhystrix.controller;

import com.boot.cloud.demo.cloudhystrix.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenyu
 * @time 2019/5/26 15:15
 */

@RestController
public class HystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("hi/{id}")
    public UserVo getUser(@PathVariable("id") Integer userId){
        UserVo userVo = restTemplate.getForObject("http//provider/user/" + userId, UserVo.class);
        return userVo;
    }

}
