package Homework2705.Factory;

public class VictorianFabric implements Fabric{
    @Override
    public Sofa createSofa() {
        return new VictorianSofa("Тиха гавань", 4444.44);
    }

    @Override
    public Table createTable() {
        return new VictorianTable("Місце роздумів",2222.22 );
    }

    @Override
    public ArmChair createArmChair() {
        return new VictorianArmChair("Мудрість віків", 3333.33);
    }
}
