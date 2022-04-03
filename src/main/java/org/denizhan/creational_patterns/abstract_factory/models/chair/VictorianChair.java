package org.denizhan.creational_patterns.abstract_factory.models.chair;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VictorianChair extends Chair{
    @Override
    public void sitOn() {
        log.info("Sit on victorian chair.");
    }
}
