package com.models;

public class Position {

    private String name;
    private Card card;
    private String originalOwner;
    private String currentOwner;

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

    public String getOriginalOwner() {
        return originalOwner;
    }

    public void setOriginalOwner(String originalOwner) {
        this.originalOwner = originalOwner;
    }

    public String getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
    }
}
