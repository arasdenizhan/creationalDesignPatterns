package org.denizhan.creational_patterns.builder.creator;

import org.denizhan.creational_patterns.builder.models.RegularHouse;

public class RegularHouseBuilder implements Builder{
    private RegularHouse regularHouse;

    @Override
    public void reset() {
        regularHouse = new RegularHouse();
    }

    @Override
    public void setBedroomNumber(int number) {
        regularHouse.setBedroomNumber(number);
    }

    @Override
    public void setBathroomNumber(int number) {
        regularHouse.setBathroomNumber(number);
    }

    @Override
    public void setHasPool(boolean status) {
        regularHouse.setHasPool(status);
    }

    @Override
    public void setIsDuplex(boolean status) {
        regularHouse.setDuplex(status);
    }

    @Override
    public RegularHouse getResult() {
        return regularHouse;
    }
}
