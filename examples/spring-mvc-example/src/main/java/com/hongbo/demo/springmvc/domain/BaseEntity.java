package com.hongbo.demo.springmvc.domain;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseEntity{
	Map<String, String> messages = new HashMap<String, String>();
	abstract Map<String, String> validateEntity();
}
