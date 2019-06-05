package com.services;

import com.database.DecksDatabase;
import com.models.Card;
import com.models.Player;

import java.util.List;

public class DeckService {

    private DecksDatabase database;

    public DeckService(DecksDatabase database) {
        this.database = database;
    }

    public Boolean doesDeckExist(Player player) {
        List<Card> deck = database.getDeckByUsername(player);
        return deck.stream().findAny().isPresent();
    }
}
