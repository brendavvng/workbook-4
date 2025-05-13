package com.pluralsight;

import java.util.Scanner;

public class SuperApp {

    public static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    public static void main(String[] args) {

        // scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        // printing out 1st message for user
        System.out.println("\n.゜｡:+.゜｡Super Hero VS. Super Villain.゜｡:+.゜｡\n");
        pause(1500);
        System.out.println("        -Introducing SUPERHERO WINNIE-     ");
        System.out.println("*・゜゜・*:.。..。.:*・*:゜・*:.。. .。.:*・゜゜・**・゜゜・*:.");
        pause(1500);

        // creating superhero w/constructor from Super Hero class to print
        SuperHero superWinnie = new SuperHero("Winnie", 100, 30);
        pause(1500);
        // getting the type of super person superWinnie is
        System.out.println(superWinnie.name + " is a " + superWinnie.getType() + ".");
        // asking super person their health status
        pause(1500);
        System.out.println(superWinnie.getStatus());
        pause(1500);

        System.out.println("\n          -Introducing VILLAIN KAI-     ");
        System.out.println("*・゜゜・*:.。..。.:*・*:゜・*:.。. .。.:*・゜゜・**・゜゜・*:.");
        pause(1500);
        SuperVillain superKai = new SuperVillain("Kai", 100, 30);
        pause(1500);
        // getting the type of super person superKai is
        System.out.println(superKai.name + " is a " + superKai.getType() + ".");
        pause(1500);
        // asking super person their health status
        System.out.println(superKai.getStatus());

        pause(1500);

        System.out.println("\n         Press ENTER to begin battle.");
        myScanner.nextLine();

        System.out.println("\n             - BATTLE BEGINS -         ");
        System.out.println("░▒▓█ ░▒▓█▓▒░▒▓█▓▒░▒▓░▒▓█ ░▒▓█▓▒░▒▓█▓▒░▒▓░▒▓█ ░");
        pause(1500);

        // creating while loop for super hero
        while (superWinnie.isAlive() && superKai.isAlive()) {
            pause(1500);
            // printing out attack message for SuperHero
            System.out.println("\n'*•.¸♡ ⍝ ⍝ Winnie attacks with Paws of Justice! ⍝ ⍝ ♡¸.•*'\n");
            pause(1500);
            superWinnie.fight(superKai);
            pause(1500);
            System.out.println(superKai.getStatus());
            pause(1500);

            if(!superKai.isAlive()) {
                break;
            }
            pause(1500);
            // printing out attack message from SuperVillain
            System.out.println("\n─── ⋆⋅☆⋅⋆ ──Kai attacks with the Evil Tail Whip!─── ⋆⋅☆⋅⋆ ──\n");
            pause(1500);
            superKai.fight(superWinnie);
            pause(1500);
            System.out.println(superWinnie.getStatus());
            pause(1500);
        }

        System.out.println("\n.。..*・゜゜・*:.。..。GAME!!!・**・゜゜・*:.゜・*:.+.゜｡   ");
        // if Super Hero is alive - print first line
        if (superWinnie.isAlive()) {
            System.out.println("\n─── ⋆⋅☆⋅⋆ SUPER HERO WINNIE WINS THE BATTLE! \n─── ⋆⋅☆⋅⋆ SUPER VILLAIN KAI LOSES...");
        } else {
            System.out.println("\n─── ⋆⋅☆⋅⋆ SUPER VILLAIN KAI WINS THE BATTLE! \n─── ⋆⋅☆⋅⋆ SUPER HERO WINNIE LOSES...");
        }

        pause(1500);
        // using printBattleLog method from SuperPerson class
        System.out.println(" ");
        System.out.println("        S T A T S          ");
        System.out.println("❀° ┄──────────────────╮");
        superWinnie.printBattleLog();
        System.out.println(" ");
        superKai.printBattleLog();
        System.out.println("╰───────────────────┄ °❀");

    }

}
