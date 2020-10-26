package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.EmployeeData;
import com.employee.repository.EmployeeRepository;


@Service
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void insertData(EmployeeData employeeObj) {
		employeeRepository.save(employeeObj);
	}
	
	public void deleteRecord(int id) {
		employeeRepository.deleteById(id);
	}
	
	public List<EmployeeData> displayAll() {
		List<EmployeeData> empList = (List<EmployeeData>) employeeRepository.findAll(); 
		return empList;
	}
	public void updateData(EmployeeData employeeObj) {
		
		employeeRepository.save(employeeObj);
	}

}
