package Homework2705.ConverterTemperature;

public class Fahrenheit extends ConverterTemperature{
    @Override
    public void covert(double celsius) {
        double fahrenheit = celsius * 9/5 + 32.0;
        System.out.println("Температура " + celsius + " градусів за Цельсієм = " + fahrenheit + " градусів по Фаренгейту");
    }
}
