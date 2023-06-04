package Homework2205.Printer;
/*Створити клас Printer. У тілі класу створіть метод void print(String value),
який виводить на екран значення аргументу. Реалізуйте можливість того,
 щоб у разі успадкування від даного класу інших класів, та виклику відповідного методу їх екземпляра,
 рядки, передані як аргументи методів, виводилися різними кольорами. Обязательно используйте приведення типів.*/
public class Printer {
    public static final String RESET = "\033[0m";
    void print(String value){
        System.out.println(value);
    }
}
