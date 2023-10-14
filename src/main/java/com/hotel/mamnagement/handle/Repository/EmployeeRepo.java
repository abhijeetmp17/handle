package com.hotel.mamnagement.handle.Repository;

import com.hotel.mamnagement.handle.Enitiy.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Integer>
{

}
