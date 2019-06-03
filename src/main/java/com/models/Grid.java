package com.models;

public class Grid {
    
    private Position topLeft;
    private Position topCenter;
    private Position topRight;
    private Position midLeft;
    private Position midCenter;
    private Position midRight;
    private Position botLeft;
    private Position botCenter;
    private Position botRight;

    public Grid() {}

    public Position getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Position topLeft) {
        this.topLeft = topLeft;
    }

    public Position getTopCenter() {
        return topCenter;
    }

    public void setTopCenter(Position topCenter) {
        this.topCenter = topCenter;
    }

    public Position getTopRight() {
        return topRight;
    }

    public void setTopRight(Position topRight) {
        this.topRight = topRight;
    }

    public Position getMidLeft() {
        return midLeft;
    }

    public void setMidLeft(Position midLeft) {
        this.midLeft = midLeft;
    }

    public Position getMidCenter() {
        return midCenter;
    }

    public void setMidCenter(Position midCenter) {
        this.midCenter = midCenter;
    }

    public Position getMidRight() {
        return midRight;
    }

    public void setMidRight(Position midRight) {
        this.midRight = midRight;
    }

    public Position getBotLeft() {
        return botLeft;
    }

    public void setBotLeft(Position botLeft) {
        this.botLeft = botLeft;
    }

    public Position getBotCenter() {
        return botCenter;
    }

    public void setBotCenter(Position botCenter) {
        this.botCenter = botCenter;
    }

    public Position getBotRight() {
        return botRight;
    }

    public void setBotRight(Position botRight) {
        this.botRight = botRight;
    }
}
