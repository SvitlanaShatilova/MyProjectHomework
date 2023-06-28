package Homework2406.Ex2.interface_comparable;
import java.util.Arrays;

/*У папці з прикладами ex_004_comparable.
Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює,
то шукаємо за ціною) -> ціною -> моделі -> кольору машини.*/
public class Main {
    public static void main(String[] args) {
    Car c1 = new Car(190, 8000, "BMW", "Red");
    Car c2 = new Car(190, 2000, "Opel", "Black");
    Car c3 = new Car(185, 10000, "Mercedes", "White");
    Car c4 = new Car(185, 10000, "Opel", "Green");
    Car c5 = new Car(185, 1000, "BMW", "White");
    Car c6 = new Car(190, 8000, "BMW", "Blue");
    Car[] c = {c1, c2, c3, c4, c5, c6};

    Arrays.sort(c);   // ClassCastException
    for (Car temp : c) {
        System.out.println(temp);
    }
}
}