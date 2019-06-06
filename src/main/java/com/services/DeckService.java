package com.services;

import com.database.CardsDatabase;
import com.database.DecksDatabase;
import com.models.Card;
import com.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeckService {

    private DecksDatabase decksDatabase;
    private CardsDatabase cardsDatabase;
    private List<Card> deckCache;

    @Autowired
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
