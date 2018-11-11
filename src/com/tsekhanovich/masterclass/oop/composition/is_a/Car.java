package com.tsekhanovich.masterclass.oop.composition.is_a;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 *
 * IS - A relationship. Car IS A Vehicle
 */

public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
