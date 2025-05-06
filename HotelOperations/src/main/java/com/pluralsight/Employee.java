package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    // private variables:
    // employeeId, name, department, payRate, hoursWorked

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    // creating start time for employee
    private double empPunchIn;

    // generating constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // generating getters for private variables
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // this is the derived getter, getting the regular hours
    public double getRegularHours() {
        // Math.min(x, y) - method to find lowest value between x and y
        return Math.min(40, hoursWorked);
    }

    // derived getter for over time hours
    public double getOvertimeHours() {
        // Math.max(x, y) - method to find highest value between x and y
        // would not want to return a negative number, so 0 will be in place of "x"
        return Math.max(0, hoursWorked - 40);
    }

    // derived getter for getting total pay rate
    public double getTotalPayRate() {
        // regular hours is 40 hours for full time
        double regularPayRate = getRegularHours() * payRate;
        // overtime is 1.5 x regular pay rate
        double overtimePayRate = getOvertimeHours() * payRate * 1.5;
        // adding regularPayRate and overtimePayRate to getTotalPayRate
        return regularPayRate + overtimePayRate;
    }

    // creating punchIn method from exercise 2
    public void punchIn (double time) {
        // takes in punch in time
        this.empPunchIn = time;
    }


    // creating punchOut method
    public void punchOut (double time) {
        // calculating how many hours worked once emp punches out
        // input variables will be: 10:00am -> 10.0, 12:30pm -> 12.5, 2:45pm -> 14.75
        double empPunchOut = time - empPunchIn;
        this.hoursWorked += empPunchOut;
       // hoursWorked = emp punch out - start time
       // emp = 0 hours;
    }

    // going to  use local date . now and HH and MM  (getHour) (getMinute) - these will be double
    // divide minutes by 60, so that 4:30 is 4.5

    // creating new punchIn method from exercise 3
    public void punchIn() {
        // importing Local Date Time for new punchIn method to get the current date
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        // re-using the double time punch in method
        punchIn(time);
    }

    // creating new punchOut  method from exercise 3
    public void punchOut() {
        LocalTime now = LocalTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        // re-using the double time punch out time method
        punchOut(time);

    }
}
