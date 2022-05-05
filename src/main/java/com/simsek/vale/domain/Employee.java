package com.simsek.vale.domain;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends BaseDomain {

    @Id
    @SequenceGenerator(name = "employee_seq", allocationSize = 1)
    @GeneratedValue(generator = "employee_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private String name;
    private String phone;
}