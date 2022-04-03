package org.denizhan.creational_patterns.abstract_factory.creator;

import org.denizhan.creational_patterns.abstract_factory.models.chair.ArtDecoChair;
import org.denizhan.creational_patterns.abstract_factory.models.sofa.ArtDecoSofa;
import org.denizhan.creational_patterns.abstract_factory.models.table.ArtDecoTable;

public class ArtDecoFurnitureFactory implements FurnitureFactory{
    @Override
    public ArtDecoChair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public ArtDecoTable createTable() {
        return new ArtDecoTable();
    }

    @Override
    public ArtDecoSofa createSofa() {
        return new ArtDecoSofa();
    }
}
