package com.hongbo.demo.webservice.data;

import java.util.ArrayList;
import java.util.List;

import com.hongbo.demo.webservice.entity.Employee;

public class EmployeeService {
	
	private final String[] names = new String[]{"Tom","Jack","Jerry","Hope","Good","May","Perfact","Bob","Terry","Elvis"};
	private final String[] codes = new String[]{"070701","070702","070703","070704","070705","070706","070707","070708","070709","070710"};

	public List<Employee> getEmployees(){
		return initEmployees();
	}
	
	private List<Employee> initEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		for(int i = 0; i < 10; i++) {
			Employee employee = new Employee();
			employee.setId(i);
			employee.setName(names[i]);
			employee.setCode(codes[i]);
			employees.add(employee);
		}
		return employees;
	}
}
