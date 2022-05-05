package com.simsek.vale.domain;

import javax.persistence.*;

@Entity

public class Vehicle extends BaseDomain {
    @Id
    @SequenceGenerator(name = "vehicle_seq", allocationSize = 1)
    @GeneratedValue(generator = "vehicle_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private String owner;
    private String ownerPhone;
    private String plate;
    private String brand;
    private String model;
    private Integer modelYear;
    private String color;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id")
    private VehicleType vehicleType;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}