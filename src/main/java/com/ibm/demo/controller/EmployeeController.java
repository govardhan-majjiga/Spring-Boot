package com.ibm.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping("employees")
	public Employee getEmployeeById() {
		
		Employee emp =new Employee(1,"Sonu",9000);
		System.out.println(emp.toString());
		return emp;	
		
	}
	@PostMapping("employees")
	public Employee addEmployee() {
		return null;
	}
	

}
