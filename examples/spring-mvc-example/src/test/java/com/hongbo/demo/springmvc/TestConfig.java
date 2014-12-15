package com.hongbo.demo.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"com.hongbo.demo.springmvc.domain",
		"com.hongbo.demo.springmvc.repository",
		"com.hongbo.demo.springmvc.service",
		"com.hongbo.demo.springmvc.controller"
})
public class TestConfig {

}
