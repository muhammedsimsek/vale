package com.simsek.vale.repo;

import com.simsek.vale.domain.ParkingArea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingAreaRepository extends JpaRepository<ParkingArea, Long> {
}