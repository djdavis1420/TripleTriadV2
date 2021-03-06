package com.models;

public class Card {

    private String id;
    private String name;
    private String element;
    private Boolean limited;
    private int topValue;
    private int bottomValue;
    private int leftValue;
    private int rightValue;

    public Card() {}

    public Card(String id, String name, String element, Boolean limited, int topValue, int bottomValue, int leftValue, int rightValue) {
        this.id = id;
        this.name = name;
        this.element = element;
        this.limited = limited;
        this.topValue = topValue;
        this.bottomValue = bottomValue;
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Boolean getLimited() {
        return limited;
    }

    public void setLimited(Boolean limited) {
        this.limited = limited;
    }

    public int getTopValue() {
        return topValue;
    }

    public void setTopValue(int topValue) {
        this.topValue = topValue;
    }

    public int getBottomValue() {
        return bottomValue;
    }

    public void setBottomValue(int bottomValue) {
        this.bottomValue = bottomValue;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(int leftValue) {
        this.leftValue = leftValue;
    }

    public int getRightValue() {
        return rightValue;
    }

    public void setRightValue(int rightValue) {
        this.rightValue = rightValue;
    }
}