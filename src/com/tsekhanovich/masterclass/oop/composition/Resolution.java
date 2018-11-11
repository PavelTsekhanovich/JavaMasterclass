package com.tsekhanovich.masterclass.oop.composition;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class Resolution {

    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
