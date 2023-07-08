package Homework0807.Ex1;
/**Використовуючи колекцію, підвійте слово:
 1. Введіть із клавіатури 5 слів до списку рядків.
 2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
 3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static ArrayList doubleValues(ArrayList list){
       ArrayList <String> temp = new ArrayList<>();
       for (int i = 0; i< list.size(); i++) {
           temp.add((String) list.get(i));
           temp.add((String) list.get(i));
       }
       return temp;
   }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            list.add((sc.nextLine()));
        }
        System.out.println(list);

        ArrayList <String> doubleList = doubleValues(list);

        for (String val: doubleList){
            System.out.println(val);
        }
    }
}

