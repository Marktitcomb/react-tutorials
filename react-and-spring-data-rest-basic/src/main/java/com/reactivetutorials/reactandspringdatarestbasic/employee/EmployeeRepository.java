package com.reactivetutorials.reactandspringdatarestbasic.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findByLastName(String lastName);
}
