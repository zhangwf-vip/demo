package com.boot.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.boot.demo.entity.User;

@Mapper
public interface UserMapper {

	/**
	 * 
	 * @Title: getUserInfo @Description: TODO(这里用一句话描述这个方法的作用) @author:
	 *         Administrator @date: 2020年1月16日 上午9:45:55 @param @param
	 *         userid @param @return 参数 @return User 返回类型 @throws
	 */
	public User getUserInfo(String userId);

	/**
	 * 
	 * @Title: userLogin @Description: TODO(这里用一句话描述这个方法的作用) @author:
	 *         Administrator @date: 2020年1月16日 上午9:40:53 @param @param
	 *         userName @param @param passWord @param @return 参数 @return User
	 *         返回类型 @throws
	 */
	public User userLogin(String userName, String passWord);

}
