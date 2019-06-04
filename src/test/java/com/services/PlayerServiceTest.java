package com.services;

import com.database.PlayersDatabase;
import com.models.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerServiceTest {

    private PlayerService playerService;
    private PlayersDatabase database;

    @Before
    public void setup() {
        database = mock(PlayersDatabase.class);
        playerService = new PlayerService(database);
    }

    @Test
    public void createPlayer_shouldGetPlayerAndDeckIDsFromDatabase() {
        String username = "djdavis1420";
        Player expectedPlayer = new Player();
        when(database.getPlayerByUsername(username)).thenReturn(expectedPlayer);

        Player actualPlayer = playerService.createPlayer(username);

        assertEquals(expectedPlayer, actualPlayer);
    }

}