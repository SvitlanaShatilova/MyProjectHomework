package Homework0807.Ex3;

import java.util.HashMap;
import java.util.Scanner;

/**Програма визначає, яка сім'я (прізвище) живе у місті:
 Приклад введення:
 · Монако
 · Іванови
 · Київ
 · Петрови
 · Лондон
 · Абрамовичі
 Приклад введення:
 · Лондон
 Приклад виведення:
 · Абрамовичі*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> family = new HashMap<>();
//        family.put("Монако", "Іванови");
//        family.put("Київ", "Петрови");
//        family.put("Лондон", "Абрамовичі");
        System.out.println("-> місто \n-> прізвище");
        family.put(sc.nextLine(), sc.nextLine());
        System.out.println("-> місто \n-> прізвище");
        family.put(sc.nextLine(), sc.nextLine());
        System.out.println("-> місто \n-> прізвище");
        family.put(sc.nextLine(), sc.nextLine());

        System.out.println("*** Перевірка введених даних: " + family);

        System.out.println("Введіть місто: ");

        System.out.println(family.get(sc.nextLine()));
    }
}
