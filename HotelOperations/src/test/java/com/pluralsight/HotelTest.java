package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void bookRoom_should_increaseBookedSuites() {
        // arrange
        // creating a hotel with 10 suites and 50 basic rooms
        Hotel theHotel = new Hotel("Matcha Hotel", 10, 50);


        // act
        // want 3 rooms and want it to be suites
        theHotel.bookRoom(3, true);


        // assert
        // testing - if we book 3 out of 10 suite rooms, you should get 7 available suites left in the hotel
        assertEquals(7, theHotel.getAvailableSuites());

    }

    // testing the basic booked rooms

    @Test
    public void bookRoom_should_increaseBookedRooms() {
        // arrange
        // creating a hotel with 10 suites and 50 basic rooms
        Hotel theHotel = new Hotel("Matcha Hotel", 10, 50);


        // act
        // want 3 rooms and want it to be regular room, that are not suites
        theHotel.bookRoom(3, false);


        // assert
        // testing - if we book 3 out of 50 rooms, you should get 47 available basic rooms left in the hotel
        assertEquals(47, theHotel.getAvailableRooms());

    }

    @Test
    public void bookRoom_should_returnFalseIfNoSuitesAvailable() {
        // arrange
        Hotel theHotel = new Hotel("Matcha Hotel", 10, 50);


        // act
        // we are testing that this should return false if there arent rooms available
        boolean success = theHotel.bookRoom(11, true);

        // assert
        // we want this to be false when we test it
        assertFalse(success);

    }

    @Test
    public void bookRoom_should_returnTrueIfNoSuitesAvailable() {
        // arrange
        Hotel theHotel = new Hotel("Matcha Hotel", 10, 50);


        // act
        // we are testing that this should return true when we book it. we are able to book 9 suites
        boolean success = theHotel.bookRoom(9, true);

        // assert
        // we want this to be true when we test it
        assertTrue(success);
    }

    @Test
    public void getName_should_returnTheHotelsName() {

        // arrange
        Hotel theHotel = new Hotel("Matcha Hotel", 10, 50);

        // act
        // creating variable, using getter
        String hotelName = theHotel.getName();

        // assert
        // testing that the hotel name matches "Matcha Hotel"
        assertEquals("Matcha Hotel", hotelName);

    }

}