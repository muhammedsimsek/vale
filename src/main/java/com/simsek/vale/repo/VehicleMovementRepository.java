package com.simsek.vale.repo;

import com.simsek.vale.domain.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Long> {
}