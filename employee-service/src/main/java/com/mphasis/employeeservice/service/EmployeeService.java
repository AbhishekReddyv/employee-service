package com.mphasis.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.employeeservice.dao.EmployeeDao;
import com.mphasis.employeeservice.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public Employee saveEmployee(Employee employee) {
		
		return employeeDao.save(employee);
		
	}

	public Employee findEmployeeById(int employeeId) {
		
		return employeeDao.findByEmployeeId(employeeId);
	}

	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
	
	
}
