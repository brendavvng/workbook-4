package com.pluralsight;

public class SuperApp {

    public static void main(String[] args) {


        System.out.println("\n -----Super Hero VS. Super Villain-----\n");
        System.out.println("     -Introducing SUPERHERO WINNIE-     ");

        SuperHero superWinnie = new SuperHero("Winnie", 100, 30);

        // asking super person their health status
        System.out.println(superWinnie.getStatus());

        System.out.println("\n       -Introducing VILLAIN KAI-     ");

        SuperVillain superKai = new SuperVillain("Kai", 100, 30);

        // asking super person their health status
        System.out.println(superKai.getStatus());

        System.out.println("\n          - BATTLE BEGINS -         ");


        // creating while loop for super hero
        while (superWinnie.isAlive() && superKai.isAlive()) {
            System.out.println("\nWinnie attacks with Paws of Justice!\n");
            superWinnie.fight(superKai);
            System.out.println(superKai.getStatus());

            if(!superKai.isAlive()) {
                break;
            }
            System.out.println("\n   ---Kai attacks with the Evil Tail Whip!---\n");
            superKai.fight(superWinnie);
            System.out.println(superWinnie.getStatus());
        }

        System.out.println("\n            - GAME!!! -   ");
        if (superWinnie.isAlive()) {
            System.out.println("\nSUPER HERO WINNIE WINS THE BATTLE! \nSUPER VILLAIN KAI LOSES...");
        } else {
            System.out.println("\nSUPER VILLAIN KAI WINS THE BATTLE! \nSUPER HERO WINNIE LOSES...");
        }

    }

}
