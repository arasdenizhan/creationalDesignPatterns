package org.denizhan.creational_patterns.abstract_factory.creator;

import org.denizhan.creational_patterns.abstract_factory.models.chair.ModernChair;
import org.denizhan.creational_patterns.abstract_factory.models.sofa.ModernSofa;
import org.denizhan.creational_patterns.abstract_factory.models.table.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public ModernChair createChair() {
        return new ModernChair();
    }

    @Override
    public ModernTable createTable() {
        return new ModernTable();
    }

    @Override
    public ModernSofa createSofa() {
        return new ModernSofa();
    }
}
