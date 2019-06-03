package com.models;

import java.util.List;
import java.util.UUID;

public class Player {

    private String username;
    private UUID playerID;
    private UUID deckID;
    private List<Card> deck;
    private List<Card> hand;

    public Player() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
