package com.boot.cloud.demo.cloudprovider.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author chenyu
 * @time 2019/5/25 16:01
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private Date userBirth;
}
