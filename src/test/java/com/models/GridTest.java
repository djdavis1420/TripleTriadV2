package com.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {

    private Grid grid;

    @Before
    public void setup() {
        grid = new Grid();
    }

    @Test
    public void shouldInstantiateGridWithPositions() {
        String expectedPositionName = "Middle Center";

        assertEquals(expectedPositionName, grid.getMiddleCenter().getName());
    }

}