package com.alei.user;

import com.alei.user.model.User;

import com.alei.common.BaseResult;
/**
 * 用户服务接口
 * @author dingjianglei
 *
 */
public interface UserService {
	/**
	 * 根据用户名获取用户信息
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public User getByUserName(String name) throws Exception;
	
	/**
	 * 用户登录服务
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public BaseResult<User> login(String userName) throws Exception;
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public BaseResult<String> modifyUserInfo(User user) throws Exception;
}
