package com.simsek.vale.domain;


import javax.persistence.*;


@Entity
public class ParkingTariff extends BaseDomain{
    @Id
    @SequenceGenerator(name = "parking_tariff_seq", allocationSize = 1)
    @GeneratedValue(generator = "parking_tariff_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private Integer startHour;
    private Integer endHour;

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