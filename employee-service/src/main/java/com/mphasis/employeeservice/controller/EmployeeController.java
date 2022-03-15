package com.mphasis.employeeservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.employeeservice.entity.Employee;
import com.mphasis.employeeservice.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable("id") int employeeId) {
		
		return employeeService.findEmployeeById(employeeId);
	}
	
	@GetMapping("/allEmployees")
	public List<Employee> findAll() {
		
		return employeeService.findAll();
	}
}
