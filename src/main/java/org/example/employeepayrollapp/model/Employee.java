package org.example.employeepayrollapp.model;

import org.example.employeepayrollapp.dto.EmployeeDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "employee_payroll")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotNull(message = "Salary is mandatory")
    private Integer salary;

    // Constructor to convert DTO → Model
    public Employee(EmployeeDTO employeeDTO) {
        this.name = employeeDTO.getName();
        this.salary = employeeDTO.getSalary();
    }

    public Employee() {

    }
}