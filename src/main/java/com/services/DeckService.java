package com.services;

import com.database.CardsDatabase;
import com.database.DecksDatabase;
import com.models.Card;
import com.models.Player;

import java.util.List;

public class DeckService {

    private DecksDatabase decksDatabase;
    private CardsDatabase cardsDatabase;
    private List<Card> deckCache;

    public DeckService(DecksDatabase decksDatabase, CardsDatabase cardsDatabase) {
        this.decksDatabase = decksDatabase;
        this.cardsDatabase = cardsDatabase;
    }

    public List<Card> generateDeck(Player player) {
        return (!doesDeckExist(player)) ? cardsDatabase.getStarterDeck() : deckCache;
    }

    private Boolean doesDeckExist(Player player) {
        deckCache = decksDatabase.getDeckByUsername(player);
        return deckCache.stream().findAny().isPresent();
    }
}
