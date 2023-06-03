package Homework2705.Factory;

public class ModernSofa implements Sofa{
    private final String name;
    private final double price;

    public ModernSofa(String name, double price) {
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
