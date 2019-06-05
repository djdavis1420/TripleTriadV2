package com.services;

import com.database.DecksDatabase;
import com.models.Card;

import java.util.List;

public class DeckService {

    private DecksDatabase database;

    public DeckService(DecksDatabase database) {
        this.database = database;
    }

    public Boolean doesDeckExist(String username) {
        List<Card> deck = database.getDeckByUsername(username);
        return deck.stream().findAny().isPresent();
    }
}
