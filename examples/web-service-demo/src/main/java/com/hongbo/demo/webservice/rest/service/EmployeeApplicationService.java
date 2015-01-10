package com.hongbo.demo.webservice.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hongbo.demo.webservice.data.EmployeeService;
import com.hongbo.demo.webservice.entity.Employee;

@Path("/employee")
public class EmployeeApplicationService {
	
	private final EmployeeService employeeService;
	
	public EmployeeApplicationService() {
		employeeService = new EmployeeService();
	}

	@GET
	@Path("/getAll")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<Employee> getEmployees(){
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}
	
	@GET
	@Path("/getEmployeeById/{employeeId}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Employee getEmployeeById(@PathParam("employeeId") String employeeId){
		List<Employee> employees = employeeService.getEmployees();
		for(Employee employee : employees) {
			if(employee.getId() == Integer.parseInt(employeeId)) {
				return employee;
			}
		}
		return new Employee();
	}
	
	@POST
	@Path("/newEmployee")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Employee getEmployeeById(Employee employee){
		System.out.println(employee.toString());
		return employee;
	}
}
