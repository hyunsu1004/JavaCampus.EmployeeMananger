package com.hyunsu.java_campus.repositories;

import com.hyunsu.java_campus.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
