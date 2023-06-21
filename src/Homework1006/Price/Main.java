package Homework1006.Price;

import java.util.ArrayList;

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
    public static void main(String[] args) throws Exception {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println();

        Price price1 = new Price("Малятко", "Абетка", 120.00);
        Price price2 = new Price("Антошка", "Коляска", 12500.00);

        ArrayList<Price> pricesList = new ArrayList<>();
        pricesList = (ArrayList<Price>) Price.addListShop(price1, price2);


        String name = "Антошка";
//        Price.serchName(pricesList, name); //НЕ ПРАЦЮЄ, В ЧОМУ ПОМИЛКА ???

      try {
          for (int i = 0; i <= pricesList.size(); i++) {
              int n=0;
              if (pricesList.get(i).nameShop.equals(name)) {
                  System.out.println("* " + pricesList.get(i));
                  n+=1;
                  System.out.println("співпадінь з введеною назвою = " + n);
              }
              if (n==0){
                  throw new Exception("Такого магазину не існує"); // ЧОМУ ЦЯ ПОМИЛКА СПРАЦЬОВУЄ ???
              }
          }
      }catch (Exception e){
          System.out.println(e);
      }
    }
}

