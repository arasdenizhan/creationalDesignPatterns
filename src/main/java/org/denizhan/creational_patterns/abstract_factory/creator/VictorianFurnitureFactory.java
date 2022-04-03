package org.denizhan.creational_patterns.abstract_factory.creator;

import org.denizhan.creational_patterns.abstract_factory.models.chair.VictorianChair;
import org.denizhan.creational_patterns.abstract_factory.models.sofa.VictorianSofa;
import org.denizhan.creational_patterns.abstract_factory.models.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public VictorianChair createChair() {
        return new VictorianChair();
    }

    @Override
    public VictorianTable createTable() {
        return new VictorianTable();
    }

    @Override
    public VictorianSofa createSofa() {
        return new VictorianSofa();
    }
}
