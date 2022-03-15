package com.mphasis.employeeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.employeeservice.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Employee findByEmployeeId(int employeeId);

}
