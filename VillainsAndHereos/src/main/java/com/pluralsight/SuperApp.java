package com.pluralsight;

public class SuperApp {

    public static void main(String[] args) {

        // creating two super people
        SuperHero superWinnie = new SuperHero("Winnie", 100, 25);
        SuperPerson superChoco = new SuperPerson("Choco", 100);

        // ask each super person their health status
        System.out.println(superWinnie.getStatus());
        System.out.println(superChoco.getStatus());

        superChoco.fight(superWinnie);
        superWinnie.fight(superChoco);

        // take damages
        superWinnie.takeDamage(0);
        superChoco.takeDamage(0);

        System.out.println(superWinnie.getStatus());
        System.out.println(superChoco.getStatus());
    }

}
