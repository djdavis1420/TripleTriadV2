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

    @Test
    public void placeCard_shouldPlaceCardOnGridAtUpperRightPosition(){
        Card card = new Card();
        String name = "Upper Right";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.UPPER_RIGHT);

        assertEquals(card, actual.getUpperRight().getCard());
        assertEquals(name, actual.getUpperRight().getName());
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtMiddleLeftPosition(){
        Card card = new Card();
        String name = "Middle Left";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.MIDDLE_LEFT);

        assertEquals(card, actual.getMiddleLeft().getCard());
        assertEquals(name, actual.getMiddleLeft().getName());
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtMiddleCenterPosition(){
        Card card = new Card();
        String name = "Middle Center";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.MIDDLE_CENTER);

        assertEquals(card, actual.getMiddleCenter().getCard());
        assertEquals(name, actual.getMiddleCenter().getName());
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtMiddleRightPosition(){
        Card card = new Card();
        String name = "Middle Right";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.MIDDLE_RIGHT);

        assertEquals(card, actual.getMiddleRight().getCard());
        assertEquals(name, actual.getMiddleRight().getName());
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtLowerLeftPosition(){
        Card card = new Card();
        String name = "Lower Left";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.LOWER_LEFT);

        assertEquals(card, actual.getLowerLeft().getCard());
        assertEquals(name, actual.getLowerLeft().getName());
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtLowerCenterPosition(){
        Card card = new Card();
        String name = "Lower Center";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.LOWER_CENTER);

        assertEquals(card, actual.getLowerCenter().getCard());
        assertEquals(name, actual.getLowerCenter().getName());
    }

    @Test
    public void placeCard_shouldPlaceCardOnGridAtLowerRightPosition(){
        Card card = new Card();
        String name = "Lower Right";

        Grid actual = gridService.placeCard(grid, card, PositionEnum.LOWER_RIGHT);

        assertEquals(card, actual.getLowerRight().getCard());
        assertEquals(name, actual.getLowerRight().getName());
    }
}