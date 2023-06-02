package Homework2705.ConverterTemperature;
/*Напишіть на ConverterTemperature клас для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
 У класу має бути метод convert, який робить конвертацію.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kelvin kelvin = new Kelvin();
        Fahrenheit fahrenheit = new Fahrenheit();
        double celsius;
        int convert;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть значення значення градусів Цельсія: ");
        celsius = sc.nextDouble();
        System.out.println("Виберіть дію: \n 1 -> конвертувати в Кельвіни \n 2 -> конвертувати в Фаренгейти");
        convert = sc.nextInt();
        if (convert == 1) kelvin.covert(celsius);
        if (convert == 2) fahrenheit.covert(celsius);


    }
}
