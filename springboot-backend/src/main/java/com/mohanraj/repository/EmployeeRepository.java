package com.mohanraj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohanraj.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
