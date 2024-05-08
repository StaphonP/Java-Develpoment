package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void shouldPunchIn() {
        LocalDateTime now = LocalDateTime.now();
        //setup
        Employee employee = new Employee("12345","Joseph","HR",24.00,35);
        LocalDateTime expectedPunchIn = LocalDateTime.now();
employee.punchIn();
       String actualPunchIn = employee.getPunchInTime();
       assertEquals(expectedPunchIn,actualPunchIn);
    }

    @Test
    void shouldPunchOut() {
    }
}