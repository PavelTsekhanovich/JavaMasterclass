package com.tsekhanovich.masterclass.oop.inheritance.lecture39_40;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
