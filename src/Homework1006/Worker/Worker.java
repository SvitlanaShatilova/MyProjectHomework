package Homework1006.Worker;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Описати клас з ім'ям Worker, що містить такі поля:
  прізвище та ініціали працівника;
  назва посади;
  рік надходження на роботу.
Написати програму, яка виконує такі дії:
  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
  якщо значення року введено не у відповідному форматі, видає виняток.
  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.*/
public class Worker {
    protected String pib;
    protected String posada;
    protected int rikNaRobotu;

    public Worker(String pib, String posada, int rikNaRobotu) {
        this.pib = pib;
        this.posada = posada;
        this.rikNaRobotu = rikNaRobotu;
        }
    @Override
    public String toString() {
        return "Працівник: " + pib;
    }
    public static int stajRoboty(Worker worker){
        int staj = 2023 - worker.rikNaRobotu;
        return staj;
    }
    public static void searchStaj(int val, ArrayList <Worker> worker){
        int staj = 0;
        for (int i=0; i< worker.size(); i++){
            staj = stajRoboty(worker.get(i));
           if (staj > val)
            System.out.println("Стаж роботи перевищує " + val + " р. - " + worker.get(i));}
        }
    }




