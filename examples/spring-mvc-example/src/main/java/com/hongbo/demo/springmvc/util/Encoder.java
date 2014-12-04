package com.hongbo.demo.springmvc.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Encoder {
	private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();
	
	public static String encode(String info) {
		return ENCODER.encode(info);
	}

}
