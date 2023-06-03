package Homework2705.Factory;

public class VictorianFabric implements Fabric{
    @Override
    public Sofa createSofa() {
        return new VictorianSofa("Тиха гавань", 2340.00);
    }

    @Override
    public Table createTable() {
        return new VictorianTable("Місце роздумів",4444.00 );
    }

    @Override
    public ArmChair createArmChair() {
        return new VictorianArmChair("Тиха гавань", 2340.00);
    }
}
