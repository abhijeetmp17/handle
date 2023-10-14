package com.hotel.mamnagement.handle.Controller;

import com.hotel.mamnagement.handle.Enitiy.Employee;
import com.hotel.mamnagement.handle.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){

       List<Employee> employees =  employeeService.fetchAllEmployee();

       return  new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

    @GetMapping("/getEmployeeById/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer empId){

       Employee employee =  employeeService.fetchEmployeeById(empId);

        return  new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
}
