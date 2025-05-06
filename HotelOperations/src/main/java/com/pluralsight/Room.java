package com.pluralsight;

public class Room {

    // isAvailable will be under isOccupied and isDirty

    // creating private variables
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    // creating constructor
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // generating getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // creating derived getter
    public boolean isAvailable() {
        // the room is only avail if the room is not occupied and if it is not dirty
        return !isOccupied() && !isDirty();
    }

    // creating new methods from exercise 2
    // creating checkIn method
    public void checkIn() {
        // it is only available if it is clean and not occupied
        // once guest checks in, it is now dirty and it is occupied
        if (isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Guest checked in.");
        } else {
            System.out.println("The room is currently unavailable.");
        }

    }

    // creating checkOut method
    public void checkOut() {
        // once guest checks out, it becomes unoccupied however, it is still dirty.
        // housekeeping will need to clean room first for it to become avail
        if (occupied) {
            occupied = false;
        } else {
            System.out.println("Room is currently unoccupied however, it is unavailable at this time.");
        }
        // can also do this code:
        // this.cleanRoom(); // cleans room
        // this.occupied = false;
    }

    // creating cleanRoom method
    public void cleanRoom() {
        if (dirty) {
            // this is basically housekeeping, simulates housekeeper cleaning room for it to become avail
            // therefore dirty = false
            dirty = false;
        } else {
            // if room is not dirty, room is clean and avail
            System.out.println("The room is clean and available.");
        }
    }
}
