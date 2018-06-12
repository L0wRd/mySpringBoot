package com.smart.service;

import com.smart.dao.UserMapper;
import com.smart.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加一个注释
     * @return
     */
    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Transactional
    public List<User> findAll() {
        System.out.println("调用dao层方法");
        return userMapper.findAll();
    }
}
