package com.services;

import com.database.DecksDatabase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class DeckServiceTest {

    private DeckService deckService;
    private DecksDatabase database;

    @Before
    public void setup() {
        deckService = new DeckService();
        database = mock(DecksDatabase.class);
    }

    @Test
    public void doesDeckExist_shouldReturnFalseWhenPlayerDeckDoesNotExist() {
        String username = "djdavis1420";

        Boolean actual = deckService.doesDeckExist(username);

        assertEquals(false, actual);
    }
}
