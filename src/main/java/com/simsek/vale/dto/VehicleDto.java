package com.simsek.vale.dto;

import com.simsek.vale.domain.VehicleType;
import lombok.Data;

import java.io.Serializable;

@Data
public class VehicleDto implements Serializable {
    private final Long id;
    private final String owner;
    private final String ownerPhone;
    private final String plate;
    private final String brand;
    private final String model;
    private final Integer modelYear;
    private final String color;
    private final VehicleType vehicleType;
}
