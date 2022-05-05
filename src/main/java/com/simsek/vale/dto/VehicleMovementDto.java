package com.simsek.vale.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class VehicleMovementDto implements Serializable {
    private final Long id;
    private final VehicleDto vehicle;
    private final ParkingSlotDto parkingSlot;
    private final Date receiveDate;
    private final Date deliveryDate;
    private final Long price;
    private final Long calculatedPrice;
    private final EmployeeDto receiverEmployee;
    private final EmployeeDto deliveryEmployee;
}
