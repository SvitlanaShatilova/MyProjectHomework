package Homework2406.Ex1;

public class Cat {
    String breed;
    double price;

    public Cat(String breed, double price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " = " + price + " USD ";
    }
}
