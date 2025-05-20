package com.pluralsight;

public interface Fightable {
    // add methods for fight, isAlive, and getStatus - taking it from SuperPerson class

    void fight(SuperPerson opponent);
    boolean isAlive();
    String getStatus();

}
