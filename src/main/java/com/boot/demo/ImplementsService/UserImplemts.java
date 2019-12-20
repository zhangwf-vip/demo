package com.boot.demo.ImplementsService;

import org.springframework.stereotype.Service;

import com.boot.demo.entity.User;
import com.boot.demo.service.IUserImplemts;

@Service
public class UserImplemts implements IUserImplemts {

	/**
	 * 
	* @Title: getUserInfo
	* @Description: 获取用户信息
	* @author: 
	* @date: 2019年12月20日
	* @param 
	* @return 
	* @throws
	 */
	@Override
	public User getUserInfo(String userName, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	* @Title: userLogin
	* @Description: 用户登录
	* @author: 
	* @date: 2019年12月20日
	* @param 
	* @return 
	* @throws
	 */
	@Override
	public User userLogin(String userName, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @Title: insertUser
	* @Description: 增加用户信息
	* @author: 
	* @date: 2019年12月20日
	* @param 
	* @return 
	* @throws
	 */
	@Override
	public String insertUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @Title: updateUSer
	* @Description: 修改用户信息
	* @author: 
	* @date: 2019年12月20日
	* @param 
	* @return 
	* @throws
	 */
	@Override
	public String updateUSer(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @Title: deleteUser
	* @Description: 删除用户信息
	* @author: 
	* @date: 2019年12月20日
	* @param 
	* @return 
	* @throws
	 */
	@Override
	public String deleteUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}