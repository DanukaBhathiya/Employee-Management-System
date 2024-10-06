package com.paymedia.employeemanagementsystemservice.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Danuka
 **/
@Setter
@Getter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, message = "First name cannot be empty")
    private String firstName;

    @NotNull
    @Size(min = 1, message = "Last name cannot be empty")
    private String lastName;

    @NotNull
    @Email(message = "Email should be valid")
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(min = 10, max = 15, message = "Phone number should be valid")
    private String phone;

    @OneToOne
    @JsonBackReference // This prevents infinite recursion
    private Department department;

}
