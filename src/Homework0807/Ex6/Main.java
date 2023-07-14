package Homework0807.Ex6;
/**Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожен з нового рядка.
* Завдання із зірочкою - якщо кількість символів не парна, доповнити символом по замовчуванню. Символ любий на Ваш смак наприклад *☺︎☕︎⚓︎⚛︎
Маємо рядок - asdfg
Вивід:
asd
fg⚓︎*/
public class Main {
    public static void main(String[] args) {

        String str = "6 годин дебаггінгу можуть урятувати вас від 5 хвилин читання документації";

        if (str.length() % 2 == 0) {


            String[] tokens = str.split("(?<=\\G.{" + (str.length() + 1) / 2 + "})");
            for (String temp : tokens) {
                System.out.println(temp);
            }
        } else {
            str = str.concat("☺");
            String[] tokens = str.split("(?<=\\G.{" + (str.length() + 1) / 2 + "})");
            for (String temp : tokens) {
                System.out.println(temp);
            }
        }
    }
}


