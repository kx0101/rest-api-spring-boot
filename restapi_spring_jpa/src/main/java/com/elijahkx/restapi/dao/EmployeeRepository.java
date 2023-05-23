package com.elijahkx.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elijahkx.restapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
