package com.boot.demo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.entity.User;
import com.boot.demo.service.UserService;

@RestController
@RequestMapping(value = "/CRUD", method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class CRUD {
	private static final Logger loggers = LogManager.getLogger(CRUD.class);
	@Autowired
	private UserService userservice;

	@RequestMapping("/ListUser")
	@ResponseBody
	public List<User> ListUser() {
		loggers.info("这是我的日志啊啊啊啊啊 啊 1硕大的");
		return userservice.ListUser();
	}

	@RequestMapping("/ListUserByname")
	@ResponseBody
	public List<User> ListUserByname(String name) {
		loggers.error("阿萨达就没看了撒旦教卢卡斯名 ");
		return userservice.findByName(name);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String delete(int id) {
		int result = userservice.delete(id);
		if (result >= 1) {
			return "删除成功";
		} else {
			return "删除失败";
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String update(User user) {
		int result = userservice.Update(user);
		if (result >= 1) {
			return "修改成功";
		} else {
			return "修改失败";
		}

	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public User insert(User user) {
		return userservice.insertUser(user);
	}

}
