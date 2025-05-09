package com.pluralsight;

public class Player {

    String player;
    String playerHand;

    // creating constructor
    public Player(String player, String playerHand) {
        this.player = player;
        this.playerHand = playerHand;
    }

    // creating getters
    public String getPlayerHand() {
        return playerHand;
    }

    public String getPlayer() {
        return player;
    }
}
