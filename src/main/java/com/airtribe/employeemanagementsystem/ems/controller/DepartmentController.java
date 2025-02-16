package com.airtribe.employeemanagementsystem.ems.controller;
import com.airtribe.employeemanagementsystem.ems.model.*;
import com.airtribe.employeemanagementsystem.ems.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
