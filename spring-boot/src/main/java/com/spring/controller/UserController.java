package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getUser")
	public void getUser(){
		List<User> list = userService.findAll();
		for(User user: list){
			System.out.println(user.getUserId()+"  "+user.getUserName());
		}
	}
}
