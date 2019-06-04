package com.services;

import com.models.Card;
import com.models.Grid;
import com.models.PositionEnum;

public class GridService {

    public Grid placeCard(Grid grid, Card card, PositionEnum positionEnum) {

        switch (positionEnum) {
            case UPPER_LEFT:
                grid.getUpperLeft().setName("Upper Left");
                grid.getUpperLeft().setCard(card);
            case UPPER_CENTER:
                grid.getUpperCenter().setName("Upper Center");
                grid.getUpperCenter().setCard(card);
            case UPPER_RIGHT:
                grid.getUpperRight().setName("Upper Right");
                grid.getUpperRight().setCard(card);
            case MIDDLE_LEFT:
                grid.getMiddleLeft().setName("Middle Left");
                grid.getMiddleLeft().setCard(card);
            case MIDDLE_CENTER:
                grid.getMiddleCenter().setName("Middle Center");
                grid.getMiddleCenter().setCard(card);
        }
        return grid;
    }
}
