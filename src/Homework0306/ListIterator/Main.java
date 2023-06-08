package Homework0306.ListIterator;

import java.util.*;
import java.lang.Math;
/*Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Main,
 створити список цілих чисел і за допомогою ListIterator пройтись по списку і збільшити значення на 1.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i<60; i++){
            num.add(i+ (int) (Math.random()*(100)));
        }
        System.out.println(num);

        ListIterator<Integer> numIterator = num.listIterator();

        while (numIterator.hasNext()) {
            System.out.print(numIterator.next()+1 + "  ");
        }
    }
 }



