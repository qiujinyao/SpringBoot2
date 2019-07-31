package com.qianfeng.springboot2.Service;

import com.qianfeng.springboot2.Entity.TUser;

import java.util.List;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/31
 */
public interface IUserService {
    List<TUser> getUserList();
}
