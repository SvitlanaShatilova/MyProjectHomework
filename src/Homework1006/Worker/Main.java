package Homework1006.Worker;

/*Описати клас з ім'ям Worker, що містить такі поля:
  прізвище та ініціали працівника;
  назва посади;
  рік надходження на роботу.
Написати програму, яка виконує такі дії:
  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
  якщо значення року введено не у відповідному форматі, видає виняток.
  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserException {
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані 5-ти працівників: \n -> Прізвище та ініціали \n -> Назву посади \n -> Рік надходження на роботу");
        //  ArrayList<Worker> workers = new ArrayList<>();
        String pib;
        String posada;
        int rik;
        ArrayList workers = new ArrayList();

        do {
                try {System.out.println("Працівник №" + counter);
                    pib = scanner.next();
                    posada = scanner.next();
                    rik = scanner.nextInt();

                    if (rik > 1990 && rik < 2023) {
                        Worker worker = new Worker(pib, posada, rik);
                        workers.add(worker);
                        Collections.sort(workers);
                        counter++;
                    } else {
                        throw new UserException("Ви ввели значення року не коректно");
                    }

                }catch (UserException userException){
                    System.out.println(userException);
                } finally {
                    System.out.println("Внесіть дані працівника");
                }

        }while (counter>3);

        System.out.println(workers);
    }

}


