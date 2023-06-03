package Homework2705.Factory;

public class VictorianArmChair implements ArmChair {
    private final String name;
    private final double price;

    public VictorianArmChair(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
