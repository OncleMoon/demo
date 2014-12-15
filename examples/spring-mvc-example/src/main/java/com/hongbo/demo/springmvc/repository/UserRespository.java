package com.hongbo.demo.springmvc.repository;

import com.hongbo.demo.springmvc.domain.User;

public interface UserRespository extends BaseRepository<User, Long>{
	
	public User findByEmailAndDeleted(String email, boolean deleted);

}
