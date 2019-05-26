package com.boot.cloud.demo.cloudhystrix.controller;

import com.boot.cloud.demo.cloudhystrix.vo.UserVo;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenyu
 * @time 2019/5/26 15:15
 */

@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    @Autowired
    private RestTemplate restTemplate;

//    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "2000")})
    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("hi/{id}")
    public UserVo getUser(@PathVariable("id") Integer userId, @RequestParam int number){
        if(number % 2 == 0){
            UserVo vo = new UserVo();
            vo.setUserName("success");
            return vo;
        }
        UserVo userVo = restTemplate.getForObject("http://provider/user/" + userId, UserVo.class);
        return userVo;
    }
    @HystrixCommand
    @GetMapping("hi1/{id}")
    public String getUser1(){
        return "hi1";
    }
    @HystrixCommand
    @GetMapping("hi2/{id}")
    public String getUser2(){
        return "hi2";
    }

    /**
     * 降级处理的方法
     * @param id
     * @return
     */
    private UserVo fallback(Integer id){
        UserVo userVo = new UserVo();
        userVo.setUserName("系统繁忙，请稍后再试");
        return userVo;
    }

    /**
     * 默认降级方法
     * @return
     */
    private String defaultFallback(){
        return "全局->系统繁忙，请稍后再试";
    }
}
