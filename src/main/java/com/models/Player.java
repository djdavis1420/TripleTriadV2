package com.models;

import java.util.List;
import java.util.UUID;

public class Player {

    private UUID playerID;
    private UUID deckID;
    private String firstName;
    private List<Card> hand;

    public Player() {}

    public UUID getPlayerID() {
        return playerID;
    }

    public void setPlayerID(UUID playerID) {
        this.playerID = playerID;
    }

    public UUID getDeckID() {
        return deckID;
    }

    public void setDeckID(UUID deckID) {
        this.deckID = deckID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
