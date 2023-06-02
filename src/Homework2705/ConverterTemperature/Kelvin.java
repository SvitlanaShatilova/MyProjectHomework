package Homework2705.ConverterTemperature;

public class Kelvin extends ConverterTemperature {

    @Override
    public void covert(double celsius) {
        double kelvin = celsius + 273.15;
        System.out.println("Температура " + celsius + " градусів за Цельсієм = " + kelvin + " градусів по Келвіну");
    }
}
