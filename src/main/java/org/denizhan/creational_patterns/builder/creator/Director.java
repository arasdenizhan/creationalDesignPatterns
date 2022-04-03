package org.denizhan.creational_patterns.builder.creator;

import org.denizhan.creational_patterns.builder.models.RegularHouse;
import org.denizhan.creational_patterns.builder.models.Villa;

public class Director {
    public Villa makeVilla(VillaBuilder villaBuilder){
         villaBuilder.reset();
         villaBuilder.setBathroomNumber(4);
         villaBuilder.setBedroomNumber(3);
         villaBuilder.setHasPool(true);
         villaBuilder.setIsDuplex(true);
         return villaBuilder.getResult();
    }

    public RegularHouse makeRegularHouse(RegularHouseBuilder regularHouseBuilder){
        regularHouseBuilder.reset();
        regularHouseBuilder.setBathroomNumber(2);
        regularHouseBuilder.setBedroomNumber(2);
        regularHouseBuilder.setHasPool(false);
        regularHouseBuilder.setIsDuplex(false);
        return regularHouseBuilder.getResult();
    }
}
