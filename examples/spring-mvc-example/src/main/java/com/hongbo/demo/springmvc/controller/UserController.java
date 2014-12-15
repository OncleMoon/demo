package com.hongbo.demo.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hongbo.demo.springmvc.domain.User;
import com.hongbo.demo.springmvc.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes="application/json")
	public @ResponseBody Map<String, String> login(@RequestBody User user){
		Map<String, String> result = new HashMap<String, String>();
		boolean isSuccess = userService.login(user);
		if(isSuccess) {
			result.put("isSuccess", Boolean.TRUE.toString());
			result.put("message", "Login Successful...");
		} else {
			result.put("isSuccess", Boolean.FALSE.toString());
			result.put("message", "Login Failed...");
		}
		return result;
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST, consumes="application/json")
	public @ResponseBody Map<String, String> addUser(@RequestBody User user) {
		Map<String, String> result = user.validateEntity();
		if(Boolean.FALSE.toString().equals(result.get("isSuccess"))) {
			return result;
		}
		
		try {
			User newUser = userService.addUser(user);
			if(newUser == null) {
				result.put("isSuccess", Boolean.FALSE.toString());
				result.put("message", "Failed to create new user...");
			}
		} catch (Exception e) {
			result.put("isSuccess", Boolean.FALSE.toString());
			result.put("message", String.format("Failed to create new user: %s", e.getMessage()));
		}
		
		return result;
	}

}
