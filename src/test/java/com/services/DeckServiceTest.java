package com.services;

import com.database.DecksDatabase;
import com.models.Card;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DeckServiceTest {

    private DeckService deckService;
    private DecksDatabase database;

    @Before
    public void setup() {
        database = mock(DecksDatabase.class);
        deckService = new DeckService(database);
    }

    @Test
    public void doesDeckExist_shouldReturnFalseWhenPlayerDeckDoesNotExist() {
        String username = "djdavis1420";
        List<Card> deck = Collections.emptyList();
        when(database.getDeckByUsername(username)).thenReturn(deck);

        Boolean actual = deckService.doesDeckExist(username);

        assertEquals(false, actual);
    }

    @Test
    public void doesDeckExist_shouldReturnTrueWhenPlayerDeckDoesExist() {
        String username = "djdavis1420";
        List<Card> deck = Collections.singletonList(new Card());
        when(database.getDeckByUsername(username)).thenReturn(deck);

        Boolean actual = deckService.doesDeckExist(username);

        assertEquals(true, actual);
    }
}
