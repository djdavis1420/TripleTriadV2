package com.database;

import com.TripleTriad;
import com.models.Card;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TripleTriad.class)
public class CardsDatabaseTest {

    @Autowired
    private CardsDatabase cardsDatabase;

    @Test
    public void getStarterDeck_shouldReturnListOfStarterCards() {
        int expectedCount = 12;
        String firstCardName = "Geezard";
        String lastCardName = "Ifrit";

        List<Card> actual = cardsDatabase.getStarterDeck();
        Card firstCard = actual.get(0);
        Card lastCard = actual.get(actual.size() -1);

        assertEquals(expectedCount, actual.size());
        assertEquals(firstCardName, firstCard.getName());
        assertEquals(lastCardName, lastCard.getName());
    }

}