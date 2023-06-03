package Homework2705.Factory;

public class ArtDecoSofa implements Sofa{
    private final String name;
    private final double price;

    public ArtDecoSofa(String name, double price) {
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


