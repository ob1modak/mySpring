package com.hasan.restapi.service;

import java.util.List;

import com.hasan.restapi.model.Employee;

public interface EmployeeService {
	
	public List<Employee> retrieveEmployees();
	  
	 public Employee getEmployee(Long employeeId);
	  
	 public void saveEmployee(Employee employee);
	  
	 public void deleteEmployee(Long employeeId);
	  
	 public void updateEmployee(Employee employee);

}
