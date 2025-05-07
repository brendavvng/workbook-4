package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_testing_punchInAndPunchOut() {
        // arrange
        Employee employee2 = new Employee("102", "Choco Cat", "HR", 20.0, 0);

        // act
        employee2.punchIn(9.0); // 9:00am
        employee2.punchOut(13.5); // 1:30pm

        // assert
        assertEquals(4.5, employee2.getHoursWorked());

    }

}