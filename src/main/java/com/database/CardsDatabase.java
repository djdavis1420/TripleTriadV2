package com.database;

import com.models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardsDatabase {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_STARTER_DECK = "SELECT * FROM cards WHERE starter = true";

    public List<Card> getStarterDeck() {
            return jdbcTemplate.query(GET_STARTER_DECK, new BeanPropertyRowMapper<>(Card.class));
    }

}
