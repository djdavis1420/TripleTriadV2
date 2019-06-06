package com.services;

import com.database.PlayersDatabase;
import com.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerService {

    private PlayersDatabase database;

    @Autowired
    public PlayerService(PlayersDatabase database) {
        this.database = database;
    }

    public Player createPlayer(String username) {
        return database.getPlayerByUsername(username);
    }

}
