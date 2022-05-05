package com.simsek.vale.dto;

import com.simsek.vale.domain.VehicleType;
import lombok.Data;

import java.io.Serializable;

@Data
public class ParkingTariffDto implements Serializable {
    private final Long id;
    private final Integer startHour;
    private final Integer endHour;
    private final VehicleType vehicleType;
}
