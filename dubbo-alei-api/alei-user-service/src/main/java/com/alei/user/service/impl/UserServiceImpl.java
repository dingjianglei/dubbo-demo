package com.alei.user.service.impl;

import javax.annotation.Resource;

import com.alei.user.UserService;
import com.alei.user.manager.UserManager;
import com.alei.user.model.User;
import com.alei.common.BaseResult;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserManager userManager;
	public User getByUserName(String name) throws Exception {
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
