package com.boot.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping(value = "/Login")
public class LoginController {

	/**
	 * 
	 * @Title: userLogin 用户登录
	 * @Description: TODO(用户登录)
	 * @author: Administrator
	 * @date: 2019年12月13日 下午3:04:48
	 * @param @param password @param @param name @param @return 参数 @return
	 *        Map<String,String> 返回类型 @throws
	 */
	@RequestMapping(value = "/userLogin", method = { RequestMethod.GET })
	@ResponseBody
	public Map<String, String> userLogin(
			@RequestParam(value = "password", required = false, defaultValue = "") String password,
			@RequestParam("name") String name) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("姓名：", name);
		map.put("密码：", password);
		return map;
	}

	/**
	 * 
	 * @Title: userInfo 用户信息 @Description: TODO(信息) @author: Administrator @date:
	 *         2019年12月13日 下午3:05:49 @param @param userid @param @param
	 *         meom @param @return 参数 @return JSONObject 返回类型 @throws
	 */
	@RequestMapping(value = "/userInfo/{userId}/{memo}", method = { RequestMethod.GET })
	@ResponseBody
	public JSONObject userInfo(@PathVariable(value = "userId") int userid, @PathVariable(value = "memo") String meom) {
		JSONObject result = new JSONObject();
		result.put("msg", "ok");
		result.put("method", "@ResponseBody");
		result.put("data", userid + " @" + meom);

		return result;

	}

	@RequestMapping(value = "/insertUser", method = { RequestMethod.POST })
	public String insertUser(@RequestBody String jsonUser) {

		return "";
	}

}
