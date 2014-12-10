package com.hongbo.demo.springmvc.util;

import org.junit.Assert;
import org.junit.Test;

public class EncoderTest {
	
	@Test
	public void testEncode() {
		String password = "spring-mvc-123";
		String expected = Encoder.encode(password);
		String actual = Encoder.encode(password);
		Assert.assertEquals(expected, actual);
	}

}
