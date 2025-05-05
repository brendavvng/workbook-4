package com.pluralsight;

public class Reservation {

    // room types can only be king or double
    // king room = $139 per night
    // double room = $124 per night
    // If the stay is over a weekend, the price per night should increase by 10%

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    // creating constructors
    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    // generating getters & setters for room type
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // creating getter for price
    public double getPrice() {
        return price;
    }

    // generating getter & setters for number of nights
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // generating getters & setters for weekend

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    // generating getter for reservation total
    public double getReservationTotal() {
        return reservationTotal;
    }
}
