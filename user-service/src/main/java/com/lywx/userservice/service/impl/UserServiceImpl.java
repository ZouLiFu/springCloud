package com.lywx.userservice.service.impl;

import com.lywx.userservice.dao.UserDao;
import com.lywx.userservice.entity.User;
import com.lywx.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zoulifu
 * @version V1.0
 * @Description:
 * @date: 2018/5/4 11:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User getUserList(long userId) {
        return userDao.getUserList(userId);
    }
}
