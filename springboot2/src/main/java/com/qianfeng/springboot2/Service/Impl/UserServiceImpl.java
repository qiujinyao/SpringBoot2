package com.qianfeng.springboot2.Service.Impl;

import com.qianfeng.springboot2.Entity.TUser;
import com.qianfeng.springboot2.Mapper.UserMapper;
import com.qianfeng.springboot2.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/31
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<TUser> getUserList() {
        return userMapper.getUserList();
    }
}
