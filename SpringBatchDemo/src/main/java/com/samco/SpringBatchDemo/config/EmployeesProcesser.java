package com.samco.SpringBatchDemo.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.samco.SpringBatchDemo.entity.Employees;
@Service
public  class EmployeesProcesser implements ItemProcessor<Employees, Employees>{

	@Override
	public Employees process(Employees employees) throws Exception {
		
		return employees;
	}

}
