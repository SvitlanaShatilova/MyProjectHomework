package Homework2705.TestDrive;
/*Створити клас - якась невідома машина
Клас має поля
model - назва машини
power - від 0.0 до 200.0
speed - від 0 до 320
price - від 0.0 до 50000.0
yearOfManufacture - для всіх один рік 1967*/
abstract class UnknownCar {
    protected final String model;
    protected final double power;
    protected final int speed;
    protected final double price;
    protected final int yearOfManufacture = 1967;

    public UnknownCar(String model, double power, int speed, double price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }

    public abstract void infoCar();
    }



