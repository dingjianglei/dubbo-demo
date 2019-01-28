package com.alei.user.service.impl;

import com.alei.common.BaseResult;
import com.alei.user.UserService;
import com.alei.user.manager.UserManager;
import com.alei.user.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;


public class UserServiceImpl implements UserService {
    Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserManager userManager;

    public User getByUserName(String name) throws Exception {
        log.info("getByUserName name={}", name);
        return userManager.getUserByName(name);
    }

    public BaseResult<User> login(String userName) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    public BaseResult<String> modifyUserInfo(User user) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
