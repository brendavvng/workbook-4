package com.pluralsight;

import java.util.Scanner;

public class SuperApp {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("\n.゜｡:+.゜｡Super Hero VS. Super Villain.゜｡:+.゜｡\n");
        System.out.println("        -Introducing SUPERHERO WINNIE-     ");
        System.out.println("*・゜゜・*:.。..。.:*・*:゜・*:.。. .。.:*・゜゜・**・゜゜・*:.");

        // creating superhero w/constructor from Super Hero class to print
        SuperHero superWinnie = new SuperHero("Winnie", 100, 30);

        // asking super person their health status
        System.out.println(superWinnie.getStatus());

        System.out.println("\n          -Introducing VILLAIN KAI-     ");
        System.out.println("*・゜゜・*:.。..。.:*・*:゜・*:.。. .。.:*・゜゜・**・゜゜・*:.");
        SuperVillain superKai = new SuperVillain("Kai", 100, 30);

        // asking super person their health status
        System.out.println(superKai.getStatus());

        System.out.println("\n        Press ENTER to begin battle.");
        myScanner.nextLine();

        System.out.println("\n             - BATTLE BEGINS -         ");
        System.out.println("░▒▓█ ░▒▓█▓▒░▒▓█▓▒░▒▓░▒▓█ ░▒▓█▓▒░▒▓█▓▒░▒▓░▒▓█ ░");

        // creating while loop for super hero
        while (superWinnie.isAlive() && superKai.isAlive()) {
            System.out.println("\n'*•.¸♡ ⍝ ⍝ Winnie attacks with Paws of Justice! ⍝ ⍝ ♡¸.•*'\n");
            superWinnie.fight(superKai);
            System.out.println(superKai.getStatus());

            if(!superKai.isAlive()) {
                break;
            }
            System.out.println("\n─── ⋆⋅☆⋅⋆ ──Kai attacks with the Evil Tail Whip!─── ⋆⋅☆⋅⋆ ──\n");
            superKai.fight(superWinnie);
            System.out.println(superWinnie.getStatus());
        }

        System.out.println("\n.。..*・゜゜・*:.。..。GAME!!!・**・゜゜・*:.゜・*:.+.゜｡   ");
        if (superWinnie.isAlive()) {
            System.out.println("\n─── ⋆⋅☆⋅⋆ SUPER HERO WINNIE WINS THE BATTLE! \n─── ⋆⋅☆⋅⋆ SUPER VILLAIN KAI LOSES...");
        } else {
            System.out.println("\n─── ⋆⋅☆⋅⋆ SUPER VILLAIN KAI WINS THE BATTLE! \n─── ⋆⋅☆⋅⋆ SUPER HERO WINNIE LOSES...");
        }

        System.out.println(" ");
        System.out.println("❀° ┄──────────────────╮");
        superWinnie.printBattleLog();
        System.out.println(" ");
        superKai.printBattleLog();
        System.out.println("╰───────────────────┄ °❀");

    }

}
