package com.models;

public class Position {

    private String name;
    private Card card;
    private Player originalOwner;
    private Player currentOwner;

    public Position() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Player getOriginalOwner() {
        return originalOwner;
    }

    public void setOriginalOwner(Player originalOwner) {
        this.originalOwner = originalOwner;
    }

    public Player getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(Player currentOwner) {
        this.currentOwner = currentOwner;
    }
}
