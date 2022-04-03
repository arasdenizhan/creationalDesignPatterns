package org.denizhan.creational_patterns.factory.creator;

import org.denizhan.creational_patterns.factory.models.Ship;

public class ShipFactory implements TransportFactory {
    @Override
    public Ship create() {
        return new Ship();
    }
}
