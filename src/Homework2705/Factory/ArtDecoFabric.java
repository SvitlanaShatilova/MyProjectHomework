package Homework2705.Factory;

public class ArtDecoFabric implements Fabric{
    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa("Солодкі сни", 5500.00);
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable("Стіл творчості", 2250.00);
    }

    @Override
    public ArmChair createArmChair() {
        return new ArtDecoArmChair("Фієста", 3100.00);
    }
}
