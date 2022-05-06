package com.simsek.vale.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class VehicleType extends BaseDomain {
    @Id
    @SequenceGenerator(name = "vehicle_type_seq", allocationSize = 1)
    @GeneratedValue(generator = "vehicle_type_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private String name;


}