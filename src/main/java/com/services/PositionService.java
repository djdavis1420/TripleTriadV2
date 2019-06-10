package com.services;

import com.factories.GridFactory;
import com.models.Position;
import org.springframework.beans.factory.annotation.Autowired;

public class PositionService {

    private GridFactory gridFactory;

    @Autowired
    public PositionService(GridFactory gridFactory) {
        this.gridFactory = gridFactory;
    }

    public void challengeUp(Position placedCardPosition, Position existingCardPosition) {
        if (placedCardPosition.getCard().getTopValue() > existingCardPosition.getCard().getBottomValue()) {
            existingCardPosition.setCurrentOwner(placedCardPosition.getOriginalOwner());
        }
    }
}
