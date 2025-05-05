package com.pluralsight;

public class Employee {

    // private variables:
    // employeeId, name, department, payRate, hoursWorked

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;


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
        double regularPayRate = getRegularHours() * payRate; // regular hours is 40 hours for full time
        double overtimePayRate = getOvertimeHours() * payRate * 1.5; // overtime is 1.5 x regular pay rate
        return regularPayRate + overtimePayRate; // adding regularPayRate and overtimePayRate to getTotalPayRate
    }


}
