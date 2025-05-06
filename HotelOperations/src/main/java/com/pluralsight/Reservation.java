package com.pluralsight;

public class Reservation {

    // room types can only be king or double
    // king room = $139 per night
    // double room = $124 per night
    // If the stay is over a weekend, the price per night should increase by 10%

    // king or double
    private String roomType;
    // price per night
    private double price;
    // number of nights people will stay
    private int numberOfNights;
    // if person will be staying the weekend (10% increase on weekends)
    private boolean weekend;

    // creating constructors
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        // calculating price per night
        this.price = calcPricePerNight(roomType);

    }

    // generating getters & setters for room type
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        // this will recalculate the price based on the room type
        this.price = calcPricePerNight(roomType);
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

    // creating method to calc price per night depending on room type
    private double calcPricePerNight(String roomType) {
        double pricePerNight = 0.0;
        if("king".equalsIgnoreCase(roomType)) {
            pricePerNight = 139.00;
        } else if ("double".equalsIgnoreCase(roomType)) {
            pricePerNight = 124.00;
        } if (weekend) {
            // for weekends, calculating the price per night * 10% increase
            pricePerNight += pricePerNight * 0.10;
        }
        return pricePerNight;
    }

    // creating method to calculate the total reservation cost
    public double getReservationTotal() {
        return price * numberOfNights;
    }

    // formatting the reservation total with 2 decimal places
    public String formatReservationTotal() {
        return String.format("$%.2f", getReservationTotal());
    }
}
