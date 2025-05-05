package com.pluralsight;

public class Room {

    // isAvailable will be under isOccupied and isDirty

    // creating private variables
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // creating constructor
    public Reservation(int numberOfBeds, double price, boolean occupied, boolean dirty) {
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
    // room is only available if it is clean and vacant
    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }
}
