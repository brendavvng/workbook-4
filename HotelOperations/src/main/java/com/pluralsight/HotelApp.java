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

        System.out.println("\n~---------------------------------------~");

        // testing punch in and punch out method
        Employee employee2 = new Employee("102", "Choco Cat", "HR", 20.0, 0);

        employee2.punchIn(9.0); // 9:00am
        employee2.punchOut(13.5); // 1:30pm

        System.out.println(employee2.getName() + "'s - Hours Worked: " + employee2.getHoursWorked());


        System.out.println("~---------------------------------------~");

        Hotel hotel = new Hotel("Four Seasons Hotel", 15, 100);

        // printing the availability
        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available rooms: " + hotel.getAvailableRooms());

        // try to book 2 suites
        boolean suitesBooked = hotel.bookRoom(2, true);
        System.out.println("Booking 2 suites: " + (suitesBooked ? "Success" : "Failed"));

        // Try to book 5 basic rooms
        boolean roomsBooked = hotel.bookRoom(5, false);
        System.out.println("Booking 5 basic rooms: " + (roomsBooked ? "Success" : "Failed"));


        // Print availability after booking
        System.out.println("Available suites after booking: " + hotel.getAvailableSuites());
        System.out.println("Available rooms after booking: " + hotel.getAvailableRooms());

        // booking 5 more suites
        boolean overbookSuites = hotel.bookRoom(5, true);
        System.out.println("Booking 5 more suites: " + (overbookSuites ? "Success" : "Failed"));

        // booking 20 more basic rooms
        boolean overbookRooms = hotel.bookRoom(20, false);
        System.out.println("Booking 20 more basic rooms: " + (overbookRooms ? "Success" : "Failed"));

        // Final availability check
        System.out.println("Final available suites: " + hotel.getAvailableSuites());
        System.out.println("Final available rooms: " + hotel.getAvailableRooms());


    }

}
