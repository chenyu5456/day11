package com.boot.cloud.demo.cloudprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyu
 * @time 2019/5/25 15:34
 */
@RestController
public class ConfigController {
    @Value("${label}")
    private String label;

    @GetMapping("config")
    private String getConfig(){
        return "config->" + label;
    }
}
