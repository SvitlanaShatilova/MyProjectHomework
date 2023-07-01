package Homework1006.Price;

import java.util.ArrayList;
import java.util.Scanner;

/*Описати клас з іменем Price, що містить такі поля:
  назву товару;
  назву магазину, в якому продається товар;
  вартість товару у гривнях.
 Написати програму, яка виконує такі дії:
  введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути
 впорядковані в алфавітному порядку за назвами магазинів);
  виведення на екран інформації про товари, що продаються в магазині,
  назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).*/
public class Main {
    public static void main(String[] args){
        int n=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Назва магазину №1: ");
        String nameShop1 = scanner.nextLine();

        System.out.println("Назва продукту: ");

        String nameProduct1 = scanner.nextLine();
        System.out.println("Ціна продукту: ");
        double priceProduct1 = scanner.nextDouble();
        System.out.println("Назва магазину №2: ");
        String nameShop2 = scanner.nextLine();
        System.out.println("Назва продукту: ");
        String nameProduct2 = scanner.nextLine();
        System.out.println("Ціна продукту: ");
        double priceProduct2 = scanner.nextDouble();

        Price price1 = new Price(nameShop1, nameProduct1, priceProduct1);
        Price price2 = new Price(nameShop2, nameProduct2, priceProduct2);

        ArrayList<Price> pricesList = new ArrayList<>();
        pricesList = (ArrayList<Price>) Price.addListShop(price1, price2);

        System.out.println("Введіть назву магазину щоб дізнятися про товари які вньому продаються: ");
        String name = scanner.nextLine();
        Price.serchName(pricesList, name); //НЕ ПРАЦЮЄ, В ЧОМУ ПОМИЛКА ???

      try {
          for (int i = 0; i < pricesList.size(); i++) {

              if (pricesList.get(i).nameShop.equals(name)) {
                  System.out.println(" " + pricesList.get(i));
                  n+=1;
                 // System.out.println("співпадінь з введеною назвою = " + n); //створено для перевірки
              }
              if (n==0){
                  throw new Exception("Такого магазину не існує"); // ЧОМУ ЦЯ ПОМИЛКА СПРАЦЬОВУЄ ???
              }}

      }catch (Exception e){
          System.out.println(e);
      }

    }
}

