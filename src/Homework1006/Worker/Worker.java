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

    public Worker(String pib, String posada, int rikNaRobotu) throws UserException {
        this.pib = pib;
        this.posada = posada;
//       if (rikNaRobotu < 1990 && rikNaRobotu > 2023) {
//            throw new UserException("Ви ввели некоректне значення року");
//        } else {
            this.rikNaRobotu = rikNaRobotu;
        }


    @Override
    public String toString() {
        return "Працівник: " + pib;
    }
}



