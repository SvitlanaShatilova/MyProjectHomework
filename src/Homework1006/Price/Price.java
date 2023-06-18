package Homework1006.Price;

import Homework1006.Worker.UserException;

import java.util.*;

/*Описати клас з іменем Price, що містить такі поля:
  назву товару;
  назву магазину, в якому продається товар;
  вартість товару у гривнях.
 Написати програму, яка виконує такі дії:
  введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути
 впорядковані в алфавітному порядку за назвами магазинів);
  виведення на екран інформації про товари, що продаються в магазині,
  назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).*/
public class Price {

    protected String nameShop;
    protected String nameProduct;
    protected double priceProduct;

    public Price(String nameShop, String nameProduct, double priceProduct) {
        this.nameShop = nameShop;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public static List<Price> addListShop(Price o1, Price o2) {
        ArrayList<Price> listShop = new ArrayList<>(2);
        listShop.add(0, o1);
        listShop.add(1, o2);
        Collections.sort(listShop, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.nameShop.compareTo(o2.nameShop);
            }
        });
        return listShop;
    }

    @Override
    public String toString() {

        return "Магазин <<" + nameShop + ">> \nназва товару: " + nameProduct + " - ціна: " + priceProduct + "\n";
    }

    public static void serchName(ArrayList<Price> list, String name)  {
        for (int i = 0; i > list.size(); i++) {
            if (list.get(i).nameShop.equals(name)) {
                System.out.println("* " + list.get(i));

            }
        }
    }
}
