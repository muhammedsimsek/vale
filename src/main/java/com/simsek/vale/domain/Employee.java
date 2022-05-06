package com.simsek.vale.domain;

import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends BaseDomain {

    @Id
    @SequenceGenerator(name = "employee_seq", allocationSize = 1)
    @GeneratedValue(generator = "employee_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @NonNull
    private String name;
    private String phone;

    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}