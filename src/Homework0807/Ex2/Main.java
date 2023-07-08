package Homework0807.Ex2;

import java.util.*;

/**Мінімальне з N чисел (використовувати LinkedList):
 1. Введіть із клавіатури число N.
 2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
 3. Знайти мінімальне число серед елементів списку – метод getMinimum.*/
public class Main {

    public static LinkedList getIntegerList(int num){
        LinkedList <Integer> temp = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            temp.add(i + (int) (Math.random() * (100)));
        }
        return temp;
    }

    public static int getMinimum(LinkedList list){
        int min = (int) list.get(0);
        ListIterator<Integer> numIterator = list.listIterator();

        while (numIterator.hasNext()) {
            int value = numIterator.next();
            if (min > value){
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       LinkedList<Integer> number;
        System.out.println("Введіть N: ");
        int n = sc.nextInt();
        number = getIntegerList(n);
        System.out.println("Список з " + n + " чисел:");
        for (Integer integer: number){
            System.out.println(integer);
        }
        System.out.println("Мінімальне число серед елементів списку = " + getMinimum(number));
    }
}
