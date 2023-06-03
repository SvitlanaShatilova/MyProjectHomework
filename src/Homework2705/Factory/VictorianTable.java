package Homework2705.Factory;

public class VictorianTable implements Table{
    private final String name;
    private final double price;

    public VictorianTable(String name, double price) {
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
