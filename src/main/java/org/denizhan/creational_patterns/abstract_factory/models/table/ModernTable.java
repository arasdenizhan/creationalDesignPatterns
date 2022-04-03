package org.denizhan.creational_patterns.abstract_factory.models.table;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModernTable extends Table{
    @Override
    public void prepareTable() {
        log.info("Prepare modern table.");
    }
}
