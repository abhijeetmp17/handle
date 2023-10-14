package com.hotel.mamnagement.handle.Controller;

import com.hotel.mamnagement.handle.Enitiy.Employee;
import com.hotel.mamnagement.handle.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("employee")
@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){

        Employee newEmployee = employeeService.createEmployee(employee);

        return new ResponseEntity<Employee>(newEmployee, HttpStatus.CREATED);

    }
}
