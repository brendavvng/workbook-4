package com.pluralsight;

import java.util.Random;
import java.util.HashMap;

// abstract class that prevents instantiation and acts as a blueprint for child classes
public abstract class SuperPerson {

    // protected properties so they can possibly be accessed by our children,
    // grand children, etc. these properties stay in the family, it's less restrictive
    // than "private"
    protected String name;
    protected int health;
    protected int experiencePoints;

    public SuperPerson(String name, int health) {
        // take in the value for name and health
        this.name = name;
        this.health = health;
        // default the experience points to 0
        this.experiencePoints = 0;
    }

    // method to return if our SuperPerson is alive
    public boolean isAlive() {

        // if they have health, they are alive, return true otherwise false
        return this.health > 0;
    }

    // method that allows us to fight another SuperPerson
    public abstract void fight(SuperPerson opponent);

    public String getType() {
        return this.getClass().getSimpleName();
        // generic way of returning
    }

    // method allows a super person to take damage
    public void takeDamage(int damageAmount) {
        // subtract the damage amount from the health
        // but we don't want to set our health below 0
        this.health -= damageAmount;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    // method to see health status of super person
    public String getStatus() {

        // build and return a string that tells us how the super person is doing
        return this.name + " has " + this.health + "% health left.";
    }

    private HashMap<String, Integer> battleLog = new HashMap<>();

    //update the log entry for our SuperPerson
    public void logHit(SuperPerson opponent) {
        String name = opponent.name;
        int count = battleLog.getOrDefault(name, 0);
        battleLog.put(name, count + 1);
    }

    //print the battle log for a SuperPerson
    public void printBattleLog() {
        System.out.println("Battle log for " + name + ":");
        for (HashMap.Entry<String, Integer> entry : battleLog.entrySet()) {
            System.out.println(" - Hit " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

}
