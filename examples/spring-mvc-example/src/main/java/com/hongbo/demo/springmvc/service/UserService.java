package com.hongbo.demo.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongbo.demo.springmvc.domain.User;
import com.hongbo.demo.springmvc.repository.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository userRespository;
	
	public boolean login(User user) {
		boolean isSuccess = false;
		
		User userInDB = userRespository.findByEmailAndDeleted(user.getEmail(), false);
		if(userInDB != null && userInDB.getPassword().equals(user.getPassword())) {
			isSuccess = true;
		}
		
		return isSuccess;
	}
	
	public User addUser(User user){
		return userRespository.save(user);
	}

}
