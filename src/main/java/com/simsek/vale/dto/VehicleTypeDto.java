package com.simsek.vale.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class VehicleTypeDto implements Serializable {
    private final Long id;
    private final String name;
}
