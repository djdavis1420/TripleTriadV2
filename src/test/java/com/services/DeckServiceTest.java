package com.services;

import com.database.CardsDatabase;
import com.database.DecksDatabase;
import com.models.Card;
import com.models.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class DeckServiceTest {

    private DeckService deckService;
    private DecksDatabase decksDatabase;
    private CardsDatabase cardsDatabase;

    @Before
    public void setup() {
        decksDatabase = mock(DecksDatabase.class);
        cardsDatabase = mock(CardsDatabase.class);
        deckService = new DeckService(decksDatabase, cardsDatabase);
    }

    @Test
    public void generateDeck_shouldGenerateStarterDeckWhenDeckDoesNotExist() {
        Player player = new Player();
        List<Card> deck = Collections.singletonList(new Card());
        when(decksDatabase.getDeckByUsername(player)).thenReturn(Collections.emptyList());
        when(cardsDatabase.getStarterDeck()).thenReturn(deck);

        List<Card> actual = deckService.generateDeck(player);

        assertEquals(deck, actual);
        verify(cardsDatabase, times(1)).getStarterDeck();
    }

    @Test
    public void generateDeck_shouldReturnCachedDeck() {
        Player player = new Player();
        List<Card> deck = Collections.singletonList(new Card());
        when(decksDatabase.getDeckByUsername(player)).thenReturn(deck);

        List<Card> actual = deckService.generateDeck(player);

        assertEquals(deck, actual);
        verify(decksDatabase, times(1)).getDeckByUsername(player);
    }
}
