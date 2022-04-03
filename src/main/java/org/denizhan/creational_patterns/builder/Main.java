package org.denizhan.creational_patterns.builder;

import org.denizhan.creational_patterns.builder.creator.Director;
import org.denizhan.creational_patterns.builder.creator.RegularHouseBuilder;
import org.denizhan.creational_patterns.builder.creator.VillaBuilder;
import org.denizhan.creational_patterns.builder.models.RegularHouse;
import org.denizhan.creational_patterns.builder.models.Villa;

public class Main {
    private static final Director director = new Director();
    private static final VillaBuilder villaBuilder = new VillaBuilder();
    private static final RegularHouseBuilder regularHouseBuilder = new RegularHouseBuilder();

    public static void main(String[] args) {
        Villa villa = director.makeVilla(villaBuilder);
        RegularHouse regularHouse = director.makeRegularHouse(regularHouseBuilder);

        villa.info();
        regularHouse.info();
    }
}
