package com.hongbo.demo.webservice.entity;

public class Employee {
	private int id;
	private String name;
	private String code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return String.format("Employee[id=%d],[name=%s],[code=%s]", id, name, code);
	}
}
