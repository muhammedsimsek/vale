package com.simsek.vale.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ParkingSlotDto implements Serializable {
    private final Long id;
    private final String slotPrefix;
    private final Integer slotNumber;
    private final ParkingAreaDto parkingArea;
}
