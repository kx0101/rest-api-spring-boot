package com.elijahkx.restapi.service;

import java.util.List;

import com.elijahkx.restapi.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
