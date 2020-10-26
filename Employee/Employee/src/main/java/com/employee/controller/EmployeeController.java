package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dao.EmployeeDao;
import com.employee.model.EmployeeData;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/insert")
	public String insertRecord() {
		
		EmployeeData empObj = new EmployeeData();
		empObj.setId(1);
		empObj.setName("Kesava");
		empObj.setDept("IBGT");
		empObj.setSalary(40000);
		
		
		EmployeeData empObj1 = new EmployeeData();
		empObj1.setId(2);
		empObj1.setName("ManiTeja");
		empObj1.setDept("CBGT");
		empObj1.setSalary(50000);
		
		employeeDao.insertData(empObj);
		employeeDao.insertData(empObj1);
		
		return "Records inserted";
		
	}
	
	@RequestMapping ("/delete/{id}")
	public String deleteData(@PathVariable ("id") int id)
	{
		employeeDao.deleteRecord(id);
		return "Record deleted successfully";
	}

	@RequestMapping("/update")
	public String updateRecord()
	{
		EmployeeData empObj = new EmployeeData();
		empObj.setId(1);
		empObj.setName("Rahul");
		empObj.setDept("SDE");
		empObj.setSalary(60000);
		
		employeeDao.updateData(empObj);
		return "Data updated succesfully";
	}
	
	@RequestMapping ("/displayAll")
	public List<EmployeeData> displayData() {
		List<EmployeeData> empList = employeeDao.displayAll();
		return empList;
	}
	
	

}
