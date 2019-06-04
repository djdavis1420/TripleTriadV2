package com.services;

import com.models.Card;
import com.models.Grid;
import com.models.PositionEnum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridServiceTest {

    private GridService gridService;
    private Grid grid;

    @Before
    public void setup() {
        grid = new Grid();
        gridService = new GridService();
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtUpperLeftPosition(){
        Card card = new Card();
        String name = "Upper Left";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.UPPER_LEFT);

        assertEquals(card, actual.getUpperLeft().getCard());
        assertEquals(name, actual.getUpperLeft().getName());
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtUpperCenterPosition(){
        Card card = new Card();
        String name = "Upper Center";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.UPPER_CENTER);

        assertEquals(card, actual.getUpperCenter().getCard());
        assertEquals(name, actual.getUpperCenter().getName());
    }
}