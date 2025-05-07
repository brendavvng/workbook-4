package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // no public setters for any of these


    // creating first constructor that only holds name, number of suites, and number of rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        // setting bookedSuites and bookedBasicRooms to 0 per exercise guidelines
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // creating second constructor that takes all the info
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // generating getters only, no setters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    // creating derived getter for available suites, calculating response based on other member variables
    public int getAvailableSuites() {
        return numberOfSuites - getBookedSuites();
    }

    // creating derived getter for available rooms, calculating response based on other member variables
    public int getAvailableRooms() {
        // number of rooms minus the booked basic rooms to get the total rooms available
        return numberOfRooms - bookedBasicRooms;
    }

    // creating bookRoom method, checking if there are enough rooms available / updating inventory
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        // checking if user wants to book a suite
        if (isSuite) {
            // checking if suites are available
            if (numberOfRooms <= getAvailableSuites()) {
                // adding the booked suites to the total
                bookedSuites += numberOfRooms;
                // returning to true if user was able to book
                return true;
            }
        } else {
            // if not a suite, it will be the basic room, checking if basic rooms are available
            if (numberOfRooms <= getAvailableRooms()) {
                // adding the booked basic rooms to the total
                bookedBasicRooms += numberOfRooms;
                // returning true if user was able to book
                return true;
            }
        }
        // if there are not enough rooms, booking will fail / become false
        return false;
    }
}
