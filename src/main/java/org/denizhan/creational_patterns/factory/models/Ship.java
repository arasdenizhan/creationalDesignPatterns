package org.denizhan.creational_patterns.factory.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ship extends TransportVehicle {

    private final int workerNumber;

    public Ship() {
        this.workerNumber = random.nextInt(10,150);
    }

    @Override
    public void doTransport() {
        log.info("Ship doing transportation, worker number: " + workerNumber);
    }
}
