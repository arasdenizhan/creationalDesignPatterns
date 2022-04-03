package org.denizhan.creational_patterns.abstract_factory;

import org.denizhan.creational_patterns.abstract_factory.creator.ArtDecoFurnitureFactory;
import org.denizhan.creational_patterns.abstract_factory.creator.ModernFurnitureFactory;
import org.denizhan.creational_patterns.abstract_factory.creator.VictorianFurnitureFactory;
import org.denizhan.creational_patterns.abstract_factory.models.chair.ArtDecoChair;
import org.denizhan.creational_patterns.abstract_factory.models.chair.ModernChair;
import org.denizhan.creational_patterns.abstract_factory.models.chair.VictorianChair;
import org.denizhan.creational_patterns.abstract_factory.models.sofa.ArtDecoSofa;
import org.denizhan.creational_patterns.abstract_factory.models.sofa.ModernSofa;
import org.denizhan.creational_patterns.abstract_factory.models.sofa.VictorianSofa;
import org.denizhan.creational_patterns.abstract_factory.models.table.ArtDecoTable;
import org.denizhan.creational_patterns.abstract_factory.models.table.ModernTable;
import org.denizhan.creational_patterns.abstract_factory.models.table.VictorianTable;

public class Main {
    private static final ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
    private static final ArtDecoFurnitureFactory artDecoFurnitureFactory = new ArtDecoFurnitureFactory();
    private static final VictorianFurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

    public static void main(String[] args) {
        ModernChair modernChair = modernFurnitureFactory.createChair();
        ModernSofa modernSofa = modernFurnitureFactory.createSofa();
        ModernTable modernTable = modernFurnitureFactory.createTable();
        modernChair.sitOn();
        modernSofa.sitOn();
        modernTable.prepareTable();

        ArtDecoChair artDecoChair = artDecoFurnitureFactory.createChair();
        ArtDecoSofa artDecoSofa = artDecoFurnitureFactory.createSofa();
        ArtDecoTable artDecoTable = artDecoFurnitureFactory.createTable();
        artDecoChair.sitOn();
        artDecoSofa.sitOn();
        artDecoTable.prepareTable();

        VictorianChair victorianChair = victorianFurnitureFactory.createChair();
        VictorianSofa victorianSofa = victorianFurnitureFactory.createSofa();
        VictorianTable victorianTable = victorianFurnitureFactory.createTable();
        victorianChair.sitOn();
        victorianSofa.sitOn();
        victorianTable.prepareTable();
    }
}
