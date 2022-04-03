package org.denizhan.creational_patterns.builder.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RegularHouse extends House{
    @Override
    public void info() {
        log.info(".: Regular House :.");
        log.info("bedroomNumber {} bathroomNumber {} hasPool {} isDuplex {}",
                bedroomNumber, bathroomNumber, hasPool, isDuplex);
    }
}
