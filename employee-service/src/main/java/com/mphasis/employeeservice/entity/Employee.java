package com.mphasis.employeeservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_Id")
	private int employeeId;

	@Column(name="organization")
	private String organization;
	
	@Column(name="department_Name")
	private String departmentName;

	@Column(name="department_Id")
	private String departmentId;
	
	@Column(name="employee_Name")
	private String empName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="designation")
	private String designation;


}
