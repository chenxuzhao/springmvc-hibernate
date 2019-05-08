package com.handcoding.services.impl;

import com.handcoding.dao.UserDao;
import com.handcoding.entity.User;
import com.handcoding.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public long addUser(User user)
    {
        return userDao.addUser(user);
    }
}
