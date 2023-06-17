package Homework1006.Worker;

import java.util.ArrayList;
import java.util.Collections;

/*Описати клас з ім'ям Worker, що містить такі поля:
  прізвище та ініціали працівника;
  назва посади;
  рік надходження на роботу.
Написати програму, яка виконує такі дії:
  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
  якщо значення року введено не у відповідному форматі, видає виняток.
  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.*/
public class ListWorker<Worker>{
    ArrayList<Worker> workers = new ArrayList<>(5);

    public ArrayList<Worker> addList(Worker worker){
        ArrayList<Worker> temp = new ArrayList<>();
        temp.add(worker);
        return temp;
    }


}
