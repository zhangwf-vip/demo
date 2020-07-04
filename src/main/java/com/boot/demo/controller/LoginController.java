package com.boot.demo.controller;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.boot.demo.entity.User;
import com.boot.demo.service.IUserImplemts;

@RestController
@RequestMapping(value = "/Login")
@Api(tags = "用户登录APi",value = "")
public class LoginController {
	private static final Logger loggers = LogManager.getLogger(LoginController.class);
	@Autowired
	private IUserImplemts IUserImplemts;

	/**
	 * 
	 * @Title: userLogin 用户登录
	 * @Description: TODO(用户登录)
	 * @author: Administrator
	 * @date: 2019年12月13日 下午3:04:48
	 * @param @param password @param @param name @param @return 参数 @return
	 *        Map<String,String> 返回类型 @throws
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	@RequestMapping(value = "/userLogin", method = { RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	@ResponseBody
	@ApiOperation(value = "用户登录接口",notes="22")
	public Map<String, String> userLogin(
			@RequestParam(value = "password", required = false, defaultValue = "") String password,
			@RequestParam("name") String name) throws IllegalArgumentException, IllegalAccessException {
		User user = IUserImplemts.userLogin(name, password);
		Map<String, String> map = new HashMap<String, String>();

		for (Field field : user.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			map.put(field.getName().toString(), field.get(user).toString());

			loggers.info(field.getName() + "@" + field.get(user));
		}

		return map;
	}

	/**
	 * 
	 * @Title: userInfo 查询用户信息
	 * @Description: TODO(查询用户信息)
	 * @author: Administrator
	 * @date: 2019年12月13日 下午3:04:48
	 * @param @param password @param @param name @param @return 参数 @return
	 *        Map<String,String> 返回类型 @throws
	 */
	@ApiOperation(value = "查询用户信息",notes="2123213213")
	@ApiImplicitParams(
			{@ApiImplicitParam(name = "userId",value = "用户id",required = false)
			,@ApiImplicitParam(name = "memo",value = "备注",required = false)
			})
	@RequestMapping(value = "/userInfo/{userId}/{memo}", method = {
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String userInfo(@PathVariable(value = "userId") String userid, @PathVariable(value = "memo") String meom) {

		loggers.error("sss");
		User model = IUserImplemts.getUserInfo(userid);

		return JSON.toJSONString(model);

	}

	/**
	 * 
	 * @Title: insertUser 添加用户
	 * @Description: TODO(添加用户)
	 * @author: Administrator
	 * @date: 2019年12月13日 下午3:04:48
	 * @param @param password @param @param name @param @return 参数 @return
	 *        Map<String,String> 返回类型 @throws
	 */
	@RequestMapping(value = "/insertUser", method = { RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String insertUser(@RequestBody String jsonUser) {
		User model = JSON.parseObject(jsonUser, User.class);
		return model.getName() + "@sss" + model.getPassword();

	}

	/**
	 * 
	 * @Title: UpdateUser 用户登录
	 * @Description: TODO(用户登录)
	 * @author: Administrator
	 * @date: 2019年12月13日 下午3:04:48
	 * @param @param password @param @param name @param @return 参数 @return
	 *        Map<String,String> 返回类型 @throws
	 */
	@RequestMapping(value = "/updateUser", method = { RequestMethod.PUT })
	@ResponseBody
	public String UpdateUser(@RequestBody String jsonuser) {
		return "";
	}

	/**
	 * 
	 * @Title: deleteUser 删除用户
	 * @Description: TODO(删除用户)
	 * @author: Administrator
	 * @date: 2019年12月13日 下午3:04:48
	 * @param @param password @param @param name @param @return 参数 @return
	 *        Map<String,String> 返回类型 @throws
	 */
	@RequestMapping(value = "/deleteuser/{userid}", method = { RequestMethod.DELETE })
	@ResponseBody
	public String deleteUser(@PathVariable("userid") String userid) {

	    return "sss";
	}
}
