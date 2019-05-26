package com.boot.cloud.demo.cloudconsumer.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author chenyu
 * @time 2019/5/25 18:40
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    private Integer UserId;
    private String userName;
    private Integer userAge;
    private Date userBirth;
}
