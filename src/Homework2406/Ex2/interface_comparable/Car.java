package Homework2406.Ex2.interface_comparable;

import java.util.Objects;

/*У папці з прикладами ex_004_comparable.
Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює,
то шукаємо за ціною) -> ціною -> моделі -> кольору машини.*/
public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car) o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            int temp2 = this.price - ((Car) o).price;
            {
                if (temp2 == 0) {
                    Objects.equals(model, this.model);
                    {
                        if (true) {
                            return this.color.compareTo(((Car) o).color);
                        }
                    }return this.model.compareTo(((Car) o).model);
                }
            } return this.price - ((Car)o).price;

        } else {
            return temp;
        }
    }
}


    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
