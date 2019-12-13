package com.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellowordController {
   
	@RequestMapping("/hello")
	public String hello()
	{
		return "sssssss";
	}
}
