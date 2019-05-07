package com.hasan.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.restapi.model.Employee;
import com.hasan.restapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	 private EmployeeRepository employeeRepository;
	 
	 public void setEmployeeRepository(EmployeeRepository employeeRepository) {
	  this.employeeRepository = employeeRepository;
	 }
	  
	 public List<Employee> retrieveEmployees() {
	  List<Employee> employees = employeeRepository.findAll();
	  return employees;
	 }
	  
	 public Employee getEmployee(Long employeeId) {
	  Optional<Employee> optEmp = employeeRepository.findById(employeeId);
	  return optEmp.get();
	 }
	  
	 public void saveEmployee(Employee employee){
	  employeeRepository.save(employee);
	 }
	  
	 public void deleteEmployee(Long employeeId){
	  employeeRepository.deleteById(employeeId);
	 }
	  
	 public void updateEmployee(Employee employee) {
	  employeeRepository.save(employee);
	 }
}
