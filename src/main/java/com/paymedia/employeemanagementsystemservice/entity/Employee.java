package com.paymedia.employeemanagementsystemservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Danuka_700488
 * @date
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
    private Department department;

}
