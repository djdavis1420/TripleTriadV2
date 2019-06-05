package com.database;

import com.TripleTriad;
import com.models.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TripleTriad.class)
public class PlayersDatabaseIT {

    @Autowired
    private PlayersDatabase playersDatabase;

    @Test
    public void createPlayer_shouldCreatePlayerWithProvidedUsername() {
        String username = "djdavis1420";
        playersDatabase.createPlayer(username);
    }

    @Test
    public void getPlayerByUsername_shouldRetrieveUserWithProvidedUsername() {
        String username = "djdavis1420";
        String expectedID = "0db791cd-8734-11e9-a3bc-0a002700000d";

        Player actual = playersDatabase.getPlayerByUsername(username);

        assertEquals(expectedID, actual.getPlayerID().toString());
    }
}
