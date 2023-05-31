package Homework2705.TestDrive;

public class Toyota extends UnknownCar {


    public Toyota(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    @Override
    public void infoCar() {
        System.out.printf("%-7s ", "Brand: ");
        System.out.printf("%-10s %n", model);
        System.out.printf("%-7s ", "Power: ");
        System.out.printf("%-7.0f %n", power);
        System.out.printf("%-7s ", "Speed: ");
        System.out.printf("%-10s %n", speed);
        System.out.printf("%-7s ", "Price: ");
        System.out.printf("%-7.2f %n", price);
        System.out.printf("%-7s ", "Year: ");
        System.out.printf("%-10s %n", yearOfManufacture);
    }
}
