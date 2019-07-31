package com.qianfeng.springboot2.Mapper;

import com.qianfeng.springboot2.Entity.TUser;

import java.util.List;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/31
 */
public interface UserMapper {
    List<TUser> getUserList();
}
