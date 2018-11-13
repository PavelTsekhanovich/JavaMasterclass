package com.tsekhanovich.masterclass.set;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class Moon extends HeavenlyBody {

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
