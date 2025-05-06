package com.pluralsight;

public class HotelApp {

    // creating main method
    public static void main(String[] args) {

        System.out.println("\nWelcome to Brenda's Hotel App Tester!");
        System.out.println("~---------------------------------------~\n");

        // printing out reservation info
        Reservation reso1 = new Reservation("king", 3, true);
        System.out.printf("Reservation #1 total: $%.2f", reso1.getReservationTotal());

        System.out.println(" ");
        Reservation reso2 = new Reservation("double", 2, false);
        System.out.printf("Reservation #2 total: $%.2f", reso2.getReservationTotal());
        System.out.println();


        System.out.println("\n~---------------------------------------~");
        System.out.println("Employee information below: \n");


        // testing employee info
        Employee emp = new Employee("1290", "Winnie", "Front Desk", 21, 40);
        System.out.printf(emp.getName() + " is a demure kitty-cat employee who works at the " + emp.getDepartment() + ".");
        System.out.println();
        System.out.printf("%s has worked %.2f hours this week.\n", emp.getName(), emp.getHoursWorked());
        System.out.printf(emp.getName() + ("'s Total Pay for one week: $%.2f"), emp.getTotalPayRate());


    }
}
