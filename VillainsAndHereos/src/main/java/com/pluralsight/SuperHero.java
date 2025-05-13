package com.pluralsight;

import java.util.Random;

// create a class using the extends keyword to basically copy all the functions from
// the parent class to the child class / subclass
public class SuperHero extends SuperPerson{

    // constructor that calls the parent class constructor
    public SuperHero(String name, int health, int powerLevel) {
        // runs the constructor in the parent class
        super(name, health);

        // in the parent, we default power level (XP) to 0
        // for our superhero we want to have them pass in power level
        // but just use that as xp
        this.experiencePoints = powerLevel;

        // let the world know the hero now exists
        System.out.println((this.name + " has arrived with Super Kitty Cat powers, with a power level of " + powerLevel + "!"));

    }

    @Override
    public void fight(SuperPerson opponent) {
        System.out.println("          ---Pow Pow!---       \n");
        // make the hero do a random amount of damage to the opponent
        // the damage should be a random number plus the exp points (powerLevel)
        // if the base damage (without the XP) was 0, don't do any damage and just say you missed
        // otherwise deal the damage and say something about you kicking butt against your opponent

        // generate a random amount of damage
        // this line returns a number between 0 and 20
        int baseDamage = new Random().nextInt(30);
        // adding experience points to damage
        int totalDamage = baseDamage + this.experiencePoints;

        // if we didnt do any damage, we missed
        if (baseDamage == 0) {
            System.out.println(this.name + " missed!");
        } else {
            // we were able to attack and damage opponent
            System.out.println(this.name + " is kicking " + opponent.name + "'s butt with " + totalDamage + "% damage!!!");
            opponent.takeDamage(totalDamage);
        }

    }

}