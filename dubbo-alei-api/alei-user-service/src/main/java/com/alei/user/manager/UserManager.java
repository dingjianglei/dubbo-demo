package com.alei.user.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.alei.user.dao.UserMapper;
import com.alei.user.model.User;

@Component
public class UserManager {
	@Resource
	UserMapper userMapper;
	
	public User getUserByName(String name){
		User user = new User();
		user.setUserName(name);
		List<User> list = userMapper.findList(user);
		if(list == null || list.size() == 0){
			return null;
		}
		return list.get(0);
	}
}
