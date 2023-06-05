package Homework0306;

import java.util.ArrayList;

/*Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo.
У класі створити список, який записати 8 тварин через метод add(index, element). Вивести список у консоль.*/

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "Zebra");
        zoo.add(1, "Camel");
        zoo.add(2, "Kangaroo");
        zoo.add(3, "Bison");
        zoo.add(4, "Lama");
        zoo.add(5, "Lion");
        zoo.add(6, "Bear");
        zoo.add(7, "Elephant");

        System.out.println(zoo);
        for (String i : zoo){
            System.out.println(i);

/*Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.*/
        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);

            System.out.println(zoo.size());
            System.out.println(zoo);

        }
    }
}
