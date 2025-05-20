package com.pluralsight;

public class SidekickDog implements Fightable {
    // add some properties to our sidekick dog
    private String name;
    private int health;
    private int barkPower;

    // generating constructor
    public SidekickDog(String name, int barkPower, int health) {
        this.name = name;
        this.barkPower = barkPower;
        this.health = health;
    }


    // generating getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBarkPower() {
        return barkPower;
    }

    public void setBarkPower(int barkPower) {
        this.barkPower = barkPower;
    }

    @Override
    public boolean isAlive(){
        return health > 0;
    }

    @Override
    public String getStatus() {
        // build and return a string that tells us how the super person is doing
        return this.name + " has " + this.health + "% health left.";
    }

    @Override
    public void fight(SuperPerson opponent) {
        System.out.println("The Sidekick dog howls at the moon!");
        opponent.takeDamage(this.barkPower);
    }

}
