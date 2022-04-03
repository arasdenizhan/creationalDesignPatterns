package org.denizhan.creational_patterns.abstract_factory.models.sofa;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArtDecoSofa extends Sofa{
    @Override
    public void sitOn() {
        log.info("Sit on art deco sofa.");
    }
}
