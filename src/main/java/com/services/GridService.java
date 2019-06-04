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
        }
        return grid;
    }
}
