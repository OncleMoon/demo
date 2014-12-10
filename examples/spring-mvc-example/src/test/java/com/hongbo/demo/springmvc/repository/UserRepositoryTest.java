package com.hongbo.demo.springmvc.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hongbo.demo.springmvc.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaTestConfig.class, TestConfig.class})
public class UserRepositoryTest {
	
	@Autowired
	private UserRespository userRespository;
	
	@Test
	public void testInsert(){
		User user = new User();
		user.setId(123L);
		user.setEmail("abc@ss.com");
		user.setPassword("xyz");
		user.setDeleted(false);
		
		userRespository.save(user);
		
		Assert.assertTrue(userRespository.count() > 0);
	}

}
