package com.services;

import com.factories.GridFactory;
import com.models.Card;
import com.models.Grid;
import com.models.Player;
import com.models.PositionEnum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PositionServiceTest {

    private Player player1;
    private Player player2;
    private Card existingCard;
    private Card placedCard;
    private Grid grid;
    private PositionService positionService;
    private GridFactory gridFactory;

    @Before
    public void setup() {
        player1 = new Player();
        player2 = new Player();
        placedCard = new Card("1011", "Squall", null, true, 10, 6, 9, 4);
        existingCard = new Card("0102", "Funguar", null, false, 5, 1, 3, 1);
        grid = new Grid();
        gridFactory = new GridFactory();
        positionService = new PositionService(gridFactory);
    }

    @Test
    public void challengeUp_shouldComparePlacedCardTopValueAgainstExistingCardBottomValue() {
        gridFactory.placeCard(grid, placedCard, PositionEnum.LOWER_CENTER);
        grid.getLowerCenter().setOriginalOwner(player1);
        grid.getLowerCenter().setCurrentOwner(player1);
        gridFactory.placeCard(grid, existingCard, PositionEnum.MIDDLE_CENTER);
        grid.getMiddleCenter().setOriginalOwner(player2);
        grid.getMiddleCenter().setCurrentOwner(player2);

        positionService.challengeUp(grid.getLowerCenter(), grid.getMiddleCenter());

        assertEquals(player1, grid.getMiddleCenter().getCurrentOwner());
        assertNotEquals(grid.getMiddleCenter().getCurrentOwner(), grid.getMiddleCenter().getOriginalOwner());
    }

    @Test
    public void challengeDown_shouldComparePlacedCardBottomValueAgainstExistingCardTopValue() {
        gridFactory.placeCard(grid, placedCard, PositionEnum.UPPER_CENTER);
        grid.getUpperCenter().setOriginalOwner(player1);
        grid.getUpperCenter().setCurrentOwner(player1);
        gridFactory.placeCard(grid, existingCard, PositionEnum.MIDDLE_CENTER);
        grid.getMiddleCenter().setOriginalOwner(player2);
        grid.getMiddleCenter().setCurrentOwner(player2);

        positionService.challengeDown(grid.getUpperCenter(), grid.getMiddleCenter());

        assertEquals(player1, grid.getMiddleCenter().getCurrentOwner());
        assertNotEquals(grid.getMiddleCenter().getCurrentOwner(), grid.getMiddleCenter().getOriginalOwner());
    }

    @Test
    public void challengeLeft_shouldComparePlacedCardLeftValueAgainstExistingCardRightValue() {
        gridFactory.placeCard(grid, placedCard, PositionEnum.MIDDLE_RIGHT);
        grid.getMiddleRight().setOriginalOwner(player1);
        grid.getMiddleRight().setCurrentOwner(player1);
        gridFactory.placeCard(grid, existingCard, PositionEnum.MIDDLE_CENTER);
        grid.getMiddleCenter().setOriginalOwner(player2);
        grid.getMiddleCenter().setCurrentOwner(player2);

        positionService.challengeLeft(grid.getMiddleRight(), grid.getMiddleCenter());

        assertEquals(player1, grid.getMiddleCenter().getCurrentOwner());
        assertNotEquals(grid.getMiddleCenter().getCurrentOwner(), grid.getMiddleCenter().getOriginalOwner());
    }

    @Test
    public void challengeRight_shouldComparePlacedCardRightValueAgainstExistingCardLeftValue() {
        gridFactory.placeCard(grid, placedCard, PositionEnum.MIDDLE_LEFT);
        grid.getMiddleLeft().setOriginalOwner(player1);
        grid.getMiddleLeft().setCurrentOwner(player1);
        gridFactory.placeCard(grid, existingCard, PositionEnum.MIDDLE_CENTER);
        grid.getMiddleCenter().setOriginalOwner(player2);
        grid.getMiddleCenter().setCurrentOwner(player2);

        positionService.challengeRight(grid.getMiddleLeft(), grid.getMiddleCenter());

        assertEquals(player1, grid.getMiddleCenter().getCurrentOwner());
        assertNotEquals(grid.getMiddleCenter().getCurrentOwner(), grid.getMiddleCenter().getOriginalOwner());
    }
}