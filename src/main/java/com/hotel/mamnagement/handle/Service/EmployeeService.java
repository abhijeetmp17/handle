package com.hotel.mamnagement.handle.Service;

import com.hotel.mamnagement.handle.Enitiy.Employee;
import com.hotel.mamnagement.handle.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee createEmployee(Employee employee) {

        Employee emp =  employeeRepo.save(employee);

        return emp;

    }

    public List<Employee> fetchAllEmployee()
    {
        List<Employee> employees = employeeRepo.findAll();

        return employees;


    }

    public Employee fetchEmployeeById(Integer id)
    {
        Employee employee = employeeRepo.findById(id).get();

        return  employee;


    }
}
