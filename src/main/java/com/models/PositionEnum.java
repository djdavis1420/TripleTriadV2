package com.models;

public enum PositionEnum {

    UPPER_LEFT("Upper Left"),
    UPPER_CENTER("Upper Center"),
    UPPER_RIGHT("Upper Right"),
    MIDDLE_LEFT("Middle Left"),
    MIDDLE_CENTER("Middle Center"),
    MIDDLE_RIGHT("Middle Right"),
    LOWER_LEFT("Lower Left"),
    LOWER_CENTER("Lower Center"),
    LOWER_RIGHT("Lower Right");

    public String name;

    PositionEnum(String name) {
        this.name = name;
    }
}
