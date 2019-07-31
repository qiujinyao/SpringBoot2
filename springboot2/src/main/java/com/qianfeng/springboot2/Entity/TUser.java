package com.qianfeng.springboot2.Entity;

import lombok.Data;

import java.util.Date;
@Data
public class TUser {
    private Integer id;

    private String username;

    private String password;

    private Date registerdate;
}