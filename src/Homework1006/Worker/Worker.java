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
public class Worker {
    public String pib;
    public String posada;
    public int rikNaRobotu;

    public Worker(String pib, String posada, int rikNaRobotu) {
        this.pib = pib;
        this.posada = posada;
        this.rikNaRobotu = rikNaRobotu;
    }

        ArrayList<Worker> workers = new ArrayList<>(5);
        int num = 0;

        public void addWorker(Worker worker) {
            workers.add(num, worker);
            num += 1;

        }

}



