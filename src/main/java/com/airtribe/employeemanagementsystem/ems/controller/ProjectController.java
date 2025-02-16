package com.airtribe.employeemanagementsystem.ems.controller;
import com.airtribe.employeemanagementsystem.ems.model.*;
import com.airtribe.employeemanagementsystem.ems.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
}