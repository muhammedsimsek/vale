package com.simsek.vale.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class VehicleMovement extends BaseDomain {
    @Id
    @SequenceGenerator(name = "vehicle_movement_seq", allocationSize = 1)
    @GeneratedValue(generator = "vehicle_movement_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "parking_slot_id")
    private ParkingSlot parkingSlot;

    private Date receiveDate;
    private Date deliveryDate;

    private Long price;
    private Long calculatedPrice;

    @ManyToOne
    @JoinColumn(name = "receiver_employee_id")
    private Employee receiverEmployee;

    @ManyToOne
    @JoinColumn(name = "delivery_employee_id")
    private Employee deliveryEmployee;


    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Employee getDeliveryEmployee() {
        return deliveryEmployee;
    }

    public void setDeliveryEmployee(Employee deliveryEmployee) {
        this.deliveryEmployee = deliveryEmployee;
    }

    public Employee getReceiverEmployee() {
        return receiverEmployee;
    }

    public void setReceiverEmployee(Employee receiverEmployee) {
        this.receiverEmployee = receiverEmployee;
    }
}