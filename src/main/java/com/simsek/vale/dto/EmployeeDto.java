package com.simsek.vale.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDto implements Serializable {
    private final Long id;
    private final String name;
    private final String phone;
}
