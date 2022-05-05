package com.simsek.vale.domain;

import javax.persistence.*;

@Entity
public class VehicleType extends BaseDomain{
    @Id
    @SequenceGenerator(name = "vehicle_type_seq", allocationSize = 1)
    @GeneratedValue(generator = "vehicle_type_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private String name;



}