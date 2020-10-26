package com.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.model.EmployeeData;

public interface EmployeeRepository extends CrudRepository<EmployeeData ,Integer> {

}
