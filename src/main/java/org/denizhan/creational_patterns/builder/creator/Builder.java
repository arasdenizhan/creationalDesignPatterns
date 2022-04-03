package org.denizhan.creational_patterns.builder.creator;

import org.denizhan.creational_patterns.builder.models.House;

public interface Builder {
    void reset();
    void setBedroomNumber(int number);
    void setBathroomNumber(int number);
    void setHasPool(boolean status);
    void setIsDuplex(boolean status);
    House getResult();
}
