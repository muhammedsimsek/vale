package com.simsek.vale.domain;

import javax.persistence.*;

@Entity

public class ParkingSlot  extends BaseDomain{
    @Id
    @SequenceGenerator(name = "parking_slot_seq", allocationSize = 1)
    @GeneratedValue(generator = "parking_slot_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private String slotPrefix;
    private Integer slotNumber;

    @ManyToOne
    @JoinColumn(name = "parking_area_id")
    private ParkingArea parkingArea;

    public ParkingArea getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(ParkingArea parkingArea) {
        this.parkingArea = parkingArea;
    }
}
