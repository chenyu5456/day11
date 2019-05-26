package com.boot.cloud.demo.cloudproviderclient.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author chenyu
 * @time 2019/5/26 0:03
 */
@Getter
@Setter
public class UserVo {
    private Integer UserId;
    private String userName;
    private Integer userAge;
    private Date userBirth;
}
