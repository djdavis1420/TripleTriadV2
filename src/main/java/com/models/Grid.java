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
        this.upperLeft = new Position();
        this.upperCenter = new Position();
        this.upperRight = new Position();
        this.middleLeft = new Position();
        this.middleCenter = new Position();
        this.middleRight = new Position();
        this.lowerLeft = new Position();
        this.lowerCenter = new Position();
        this.lowerRight = new Position();
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
