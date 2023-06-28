package Homework2406.Ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Cat> cats = new ArrayList<>();
        cats.add(new Cat("Ашера", 125_000.00));
        cats.add(new Cat("Саванна", 50_000.00));
        cats.add(new Cat("Бенгальська кішка", 25_000.00));
        cats.add(new Cat("Персидська кішка", 5_500.00));
        cats.add(new Cat("Пітерболд", 5_000.00));
        cats.add(new Cat("Сфінкс", 3_000.00));
        cats.add(new Cat("Скоттиш-фолд", 3_000.00));
        cats.add(new Cat("Американський керл", 1_200.00));
        cats.add(new Cat("Американська жорсткошерстка", 1_200.00));
        cats.add(new Cat("Мейн-кун", 1_000.00));

        System.out.println(cats);

        System.out.println("\n****************Iterator***************");
        Iterator<Cat> catIterator = cats.iterator();

        while (catIterator.hasNext()){
            Cat tmp = catIterator.next();
            System.out.println(tmp);
        }
        System.out.println("\n**************ListIterator**************");
        ListIterator<Cat> catListIterator = cats.listIterator();
        while (catListIterator.hasNext()){
            Cat tmp = catListIterator.next();
            System.out.println(tmp);
        }
    }
}
