package com.simsek.vale.domain;

import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ParkingArea extends BaseDomain {
    @Id
    @SequenceGenerator(name = "parking_area_seq", allocationSize = 1)
    @GeneratedValue(generator = "parking_area_seq", strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @NonNull
    private String name;
}
