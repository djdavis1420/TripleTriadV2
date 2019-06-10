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

    public void challengeDown(Position placedCardPosition, Position existingCardPosition) {
        if (placedCardPosition.getCard().getBottomValue() > existingCardPosition.getCard().getTopValue()) {
            existingCardPosition.setCurrentOwner(placedCardPosition.getOriginalOwner());
        }
    }

    public void challengeLeft(Position placedCardPosition, Position existingCardPosition) {
        if (placedCardPosition.getCard().getLeftValue() > existingCardPosition.getCard().getRightValue()) {
            existingCardPosition.setCurrentOwner(placedCardPosition.getOriginalOwner());
        }
    }
}
