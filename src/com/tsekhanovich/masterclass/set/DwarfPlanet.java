package com.tsekhanovich.masterclass.set;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class DwarfPlanet extends HeavenlyBody {

    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
