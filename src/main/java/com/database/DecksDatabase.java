package com.database;

import com.models.Card;
import com.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DecksDatabase {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Card> getDeckByUsername(Player player) {
        return null;
    }
}
