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

    public Boolean doesDeckExist(Player player) {
        List<Card> deck = decksDatabase.getDeckByUsername(player);
        deckCache = deck;
        return deck.stream().findAny().isPresent();
    }

    public List<Card> generateDeck(Player player) {
        if (!doesDeckExist(player)) {
            return cardsDatabase.getStarterDeck();
        }
        return deckCache;
    }
}
