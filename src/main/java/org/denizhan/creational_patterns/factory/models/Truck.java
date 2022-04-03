package org.denizhan.creational_patterns.factory.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Truck extends TransportVehicle {

    private final float truckSpeed;

    public Truck() {
        this.truckSpeed = random.nextInt(80,150);
    }

    @Override
    public void doTransport() {
        log.info("Truck doing transportation, speed: " + truckSpeed);
    }
}
