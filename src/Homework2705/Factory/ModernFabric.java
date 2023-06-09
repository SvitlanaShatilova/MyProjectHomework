package Homework2705.Factory;

public class ModernFabric implements Fabric{
    @Override
    public Sofa createSofa() {
        return new ModernSofa("Гіпер портал", 7777.77);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Пульт керування", 6666.66);
    }

    @Override
    public ArmChair createArmChair() {
        return new ModernArmChair("Стар шіп", 5555.55);
    }
}
