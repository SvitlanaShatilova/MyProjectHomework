package Homework2705.Factory;

public class ArtDecoFabric implements Fabric{
    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa("Солодкі сни", 3456.78);
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable("Стіл творчості", 1234.56);
    }

    @Override
    public ArmChair createArmChair() {
        return new ArtDecoArmChair("Фієста", 2345.67);
    }
}
