package com.airtribe.employeemanagementsystem.ems.repository;

import com.airtribe.employeemanagementsystem.ems.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByEmployeesId(Long employeeId);
}