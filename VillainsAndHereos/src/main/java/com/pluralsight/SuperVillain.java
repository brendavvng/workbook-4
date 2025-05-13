package com.pluralsight;

import java.util.Random;

public class SuperVillain extends SuperPerson {

    // constructor that calls the parent class constructor
    public SuperVillain(String name, int health, int evilLevel) {
        super(name, health);

        this.experiencePoints = evilLevel;

        System.out.println(this.name + " unleashes Super Chonky Evilness, with an evil level of " + evilLevel + "!");

    }

    @Override
    public void fight(SuperPerson opponent) {
        System.out.println("             ༉‧₊˚. × Whip Whip! × ༉‧₊˚.        \n");
        int evilDamage = new Random().nextInt(25);
        // adding experience points to damage
        int evilTotalDamage = evilDamage + this.experiencePoints;


        if (evilDamage == 0) {
            System.out.println(this.name + " misses!!! No damage done...");
        } else {
            // we were able to attack and damage opponent
            System.out.println(this.name + " whoops " + opponent.name + " with " + evilTotalDamage + "% of evil damage!!!");
            opponent.takeDamage(evilTotalDamage);
            logHit(opponent);
        }

    }

//    @Override
//    public String getType() {
//        return "SuperVillain";
//    }

}
