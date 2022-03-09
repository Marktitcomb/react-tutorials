package com.reactivetutorials.reactandspringdatarestbasic.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DataLoader(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee(null, "Steve", "madden", "steve@hotmail.com", "engineer"));
        Employee steve = (Employee) employeeRepository.findById(1L).orElse(null);
        System.out.println("loaded in data: " + steve.getEmail());
    }
}
