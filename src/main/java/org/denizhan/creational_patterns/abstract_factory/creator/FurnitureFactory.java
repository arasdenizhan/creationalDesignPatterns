package org.denizhan.creational_patterns.abstract_factory.creator;

import org.denizhan.creational_patterns.abstract_factory.models.chair.Chair;
import org.denizhan.creational_patterns.abstract_factory.models.sofa.Sofa;
import org.denizhan.creational_patterns.abstract_factory.models.table.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
