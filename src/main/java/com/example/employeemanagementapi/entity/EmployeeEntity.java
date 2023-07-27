package com.example.employeemanagementapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // lombok annotation that provides shortcuts etc getter/setter
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
