package com.samco.SpringBatchDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samco.SpringBatchDemo.entity.Employees;
@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer>
{

}
