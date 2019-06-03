package com.models;

public class Grid {
    
    private Position upperLeft;
    private Position upperCenter;
    private Position upperRight;
    private Position middleLeft;
    private Position middleCenter;
    private Position middleRight;
    private Position lowerLeft;
    private Position lowerCenter;
    private Position lowerRight;

    public Grid() {
        this.upperLeft = new Position("Upper Left");
        this.upperCenter = new Position("Upper Center");
        this.upperRight = new Position("Upper Right");
        this.middleLeft = new Position("Middle Left");
        this.middleCenter = new Position("Middle Center");
        this.middleRight = new Position("Middle Right");
        this.lowerLeft = new Position("Lower Left");
        this.lowerCenter = new Position("Lower Center");
        this.lowerRight = new Position("Lower Right");
    }

    public Position getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Position upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Position getUpperCenter() {
        return upperCenter;
    }

    public void setUpperCenter(Position upperCenter) {
        this.upperCenter = upperCenter;
    }

    public Position getUpperRight() {
        return upperRight;
    }

    public void setUpperRight(Position upperRight) {
        this.upperRight = upperRight;
    }

    public Position getMiddleLeft() {
        return middleLeft;
    }

    public void setMiddleLeft(Position middleLeft) {
        this.middleLeft = middleLeft;
    }

    public Position getMiddleCenter() {
        return middleCenter;
    }

    public void setMiddleCenter(Position middleCenter) {
        this.middleCenter = middleCenter;
    }

    public Position getMiddleRight() {
        return middleRight;
    }

    public void setMiddleRight(Position middleRight) {
        this.middleRight = middleRight;
    }

    public Position getLowerLeft() {
        return lowerLeft;
    }

    public void setLowerLeft(Position lowerLeft) {
        this.lowerLeft = lowerLeft;
    }

    public Position getLowerCenter() {
        return lowerCenter;
    }

    public void setLowerCenter(Position lowerCenter) {
        this.lowerCenter = lowerCenter;
    }

    public Position getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Position lowerRight) {
        this.lowerRight = lowerRight;
    }
}
