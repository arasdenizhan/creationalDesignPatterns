package org.denizhan.creational_patterns.abstract_factory.models.table;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArtDecoTable extends Table{
    @Override
    public void prepareTable() {
        log.info("Prepare art deco table.");
    }
}
