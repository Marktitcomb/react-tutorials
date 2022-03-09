package com.reactivetutorials.reactandspringdatarestbasic.employee;


import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    //autowiring from the constructor
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public Employee getEmployeeWithId(Long id){

        return employeeRepository.findById(id).orElse(null);
    }

    public Employee findByLastName(String name){
        return employeeRepository.findByLastName(name);
    }

    public Set<Employee> findAll(){
        Set<Employee> employees = new HashSet<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }
}
