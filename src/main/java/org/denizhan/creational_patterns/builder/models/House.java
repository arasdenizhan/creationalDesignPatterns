package org.denizhan.creational_patterns.builder.models;

import lombok.Setter;

@Setter
public abstract class House {
    protected int bedroomNumber;
    protected int bathroomNumber;
    protected boolean hasPool;
    protected boolean isDuplex;
    public abstract void info();
}
