package com.services;

import com.database.PlayersDatabase;
import com.models.Player;

public class PlayerService {

    private PlayersDatabase database;

    public PlayerService(PlayersDatabase database) {
        this.database = database;
    }

    public Player createPlayer(String username) {
        return database.getPlayerByUsername(username);
    }

}
