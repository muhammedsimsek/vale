package com.simsek.vale.repo;

import com.simsek.vale.domain.ParkingTariff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingTariffRepository extends JpaRepository<ParkingTariff, Long> {
}