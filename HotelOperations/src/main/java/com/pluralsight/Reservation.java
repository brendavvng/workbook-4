package com.pluralsight;

public class Reservation {

    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return firstName;
    }
    // a calculated getter
    public String getFullName() {
        return firstName + " " + lastName;
    }

}
