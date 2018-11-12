package com.tsekhanovich.masterclass.oop.inheritance.challenge;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class Main {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.steer(20);
        outlander.accelerate(-42);
    }
}
