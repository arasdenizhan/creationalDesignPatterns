package org.denizhan.creational_patterns.factory.creator;

import org.denizhan.creational_patterns.factory.models.Truck;

public class TruckFactory implements TransportFactory {
    @Override
    public Truck create() {
        return new Truck();
    }
}
