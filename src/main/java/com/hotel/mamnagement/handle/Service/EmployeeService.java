package com.hotel.mamnagement.handle.Service;

import com.hotel.mamnagement.handle.Enitiy.Employee;
import com.hotel.mamnagement.handle.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee createEmployee(Employee employee) {

        Employee emp =  employeeRepo.save(employee);

        return emp;

    }
}
