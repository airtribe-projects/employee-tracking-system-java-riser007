package com.airtribe.employeemanagementsystem.ems.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import com.airtribe.employeemanagementsystem.ems.model.Employee;
import com.airtribe.employeemanagementsystem.ems.service.EmployeeService;
import com.airtribe.employeemanagementsystem.ems.repository.EmployeeRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    private Employee employee1;
    private Employee employee2;

    @BeforeEach
    void setUp() {
        employee1 = new Employee();
        employee1.setId(1L);
        employee1.setName("John Doe");
        employee1.setEmail("john@example.com");

        employee2 = new Employee();
        employee2.setId(2L);
        employee2.setName("Jane Doe");
        employee2.setEmail("jane@example.com");
    }

    @Test
    void testGetAllEmployees() {
        when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee1, employee2));
        List<Employee> employees = employeeService.getAllEmployees();
        assertThat(employees).hasSize(2);
    }

    @Test
    void testGetEmployeeById() {
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee1));
        Optional<Employee> foundEmployee = employeeService.getEmployeeById(1L);
        assertThat(foundEmployee).isPresent().contains(employee1);
    }

    @Test
    void testSaveEmployee() {
        when(employeeRepository.save(employee1)).thenReturn(employee1);
        Employee savedEmployee = employeeService.saveEmployee(employee1);
        assertThat(savedEmployee).isEqualTo(employee1);
    }

    @Test
    void testDeleteEmployee() {
        doNothing().when(employeeRepository).deleteById(1L);
        employeeService.deleteEmployee(1L);
    }
}
