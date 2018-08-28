package com.yc.service.impl;

import com.yc.dao.UserMapper;
import com.yc.domain.User;
import com.yc.domain.UserExample;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void registe(User user){
        UserExample userExample = new UserExample();
        if(user.getuName()==null||user.getuName()==""){
            throw new RuntimeException("用户名不能为空");
        }
        if(user.getuPassword()==null||user.getuPassword()==""){
            throw new RuntimeException("密码不能为空");
        }
        if(user.getuEmail()==null||user.getuEmail()==""){
            throw new RuntimeException("邮箱不能为空");
        }
        userExample.createCriteria().andUNameEqualTo(user.getuName());
        if(userMapper.selectByExample(userExample).size()!=0){
            throw new RuntimeException("用户名已存在");
        }
        userExample.clear();
        userExample.createCriteria().andUEmailEqualTo(user.getuEmail());
        if(userMapper.selectByExample(userExample).size()!=0){
            throw new RuntimeException("邮箱已被注册");

        }
        user.setCreateTime(new Date());
        user.setHeadImg("default.jpg");
        userMapper.insert(user);
    }

    @Override
    public User login(String uName, String uPassword) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUNameEqualTo(uName).andUPasswordEqualTo(uPassword);
        List<User> list=userMapper.selectByExample(userExample);
        if(list.size()==0){
            throw new RuntimeException("用户名或密码错误");
        }
        return list.get(0);
    }

    @Override
    @Transactional
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getById(Integer getuId) {
        return userMapper.selectByPrimaryKey(getuId);
    }
}
