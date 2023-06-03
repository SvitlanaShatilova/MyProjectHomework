package Homework2705.Factory;

public class ModernFabric implements Fabric{
    @Override
    public Sofa createSofa() {
        return new ModernSofa("Гіпер портал", 5340.17);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Пульт керування", 4340.00);
    }

    @Override
    public ArmChair createArmChair() {
        return new ModernArmChair("Стар шіп", 1340.00);
    }
}
