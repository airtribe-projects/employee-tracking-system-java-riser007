package com.airtribe.employeemanagementsystem.ems.repository;

import com.airtribe.employeemanagementsystem.ems.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}