package org.denizhan.creational_patterns.factory;

import org.denizhan.creational_patterns.factory.creator.ShipFactory;
import org.denizhan.creational_patterns.factory.creator.TruckFactory;
import org.denizhan.creational_patterns.factory.models.Ship;
import org.denizhan.creational_patterns.factory.models.Truck;

public class Main {

    private static final ShipFactory shipFactory = new ShipFactory();
    private static final TruckFactory truckFactory = new TruckFactory();

    public static void main(String[] args) {
        Ship ship = shipFactory.create();
        Truck truck = truckFactory.create();
        ship.doTransport();
        truck.doTransport();
    }
}
