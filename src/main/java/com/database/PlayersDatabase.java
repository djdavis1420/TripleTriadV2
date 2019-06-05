package com.database;

import com.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlayersDatabase {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String CREATE_PLAYER = "INSERT INTO players (username) VALUES (?)";
    private static final String GET_PLAYER = "SELECT * FROM players WHERE username = ?";

    public void createPlayer(String username) {
        try {
            jdbcTemplate.update(CREATE_PLAYER, username);
        } catch (DuplicateKeyException e) {
            System.out.println("=====This username already exists.=====");
        }
    }

    public Player getPlayerByUsername(String username) {
        try {
            return jdbcTemplate.query(GET_PLAYER, new Object[]{username}, new BeanPropertyRowMapper<>(Player.class)).get(0);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("=====This username does not exist.=====");
            return null;
        }
    }
}
