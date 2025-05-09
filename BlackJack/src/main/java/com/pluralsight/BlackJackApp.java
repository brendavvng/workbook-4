package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {

    public static void main(String[] args) {

        // importing scanner to read user input
        Scanner myScanner = new Scanner(System.in);


        // String player1 =



        //create the deck
        Deck deck = new Deck();
        //create the hand
        Hand hand1 = new Hand();

        // deal 5 cards from the deck and add them to the hand
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }

        //print out the value of all the cards in the hand
        System.out.println("This hand is worth " + hand1.getValue());
    }

}
