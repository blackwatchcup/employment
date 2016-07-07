package com.etc.employment.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.employment.entity.User;
import com.etc.employment.service.IUserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	@RequestMapping("/add")
	public String add(){
		User user = new User("zhiwei","123");
		userService.addUser(user);
		return "add";
	}
}
