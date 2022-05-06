package com.simsek.vale;

import com.simsek.vale.domain.Employee;
import com.simsek.vale.domain.ParkingArea;
import com.simsek.vale.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataBase Loader...");
        Employee e = new Employee();
        e.setName("muhammed");
        e.setPhone("0532");
        employeeRepository.save(e);

    }
}
