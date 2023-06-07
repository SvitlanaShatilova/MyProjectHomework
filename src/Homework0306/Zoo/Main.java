package Homework0306.Zoo;

import java.util.ArrayList;

public class Main {
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
        for (String i : zoo) {
            System.out.println(i);
        }

        /*Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.*/
        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);

        System.out.println(zoo.size());
        System.out.println(zoo);

    }
}

