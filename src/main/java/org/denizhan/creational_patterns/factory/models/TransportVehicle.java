package org.denizhan.creational_patterns.factory.models;

import java.util.Random;

public abstract class TransportVehicle {
    protected static final Random random = new Random();
    public abstract void doTransport();
}
