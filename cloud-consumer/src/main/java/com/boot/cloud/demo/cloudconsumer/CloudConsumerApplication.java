package com.boot.cloud.demo.cloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.boot.cloud.demo.cloudconsumer", "com.boot.cloud.demo.cloudproviderclient"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.boot.cloud.demo.cloudproviderclient.client")
public class CloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerApplication.class, args);
    }

}
