package org.denizhan.creational_patterns.builder.creator;

import org.denizhan.creational_patterns.builder.models.Villa;

public class VillaBuilder implements Builder{
    private Villa villa;

    @Override
    public void reset() {
        villa = new Villa();
    }

    @Override
    public void setBedroomNumber(int number) {
        villa.setBedroomNumber(number);
    }

    @Override
    public void setBathroomNumber(int number) {
        villa.setBathroomNumber(number);
    }

    @Override
    public void setHasPool(boolean status) {
        villa.setHasPool(status);
    }

    @Override
    public void setIsDuplex(boolean status) {
        villa.setDuplex(status);
    }

    @Override
    public Villa getResult() {
        return villa;
    }
}
