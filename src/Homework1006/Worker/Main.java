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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserException{
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані 5-ти працівників: \n -> Прізвище та ініціали \n -> Назву посади \n -> Рік надходження на роботу");
        ArrayList<Worker> workers = new ArrayList<>();

        do {
            try {
                System.out.println("Працівник №" + counter);
                Worker worker = new Worker(scanner.next(), scanner.next(), scanner.nextInt());
                if (worker.rikNaRobotu< 1990 && worker.rikNaRobotu > 2023) {
                    throw new UserException("Ви ввели некоректне значення року");
                }else {
                workers.add(worker);
                counter++;}
            } catch (UserException e){
                System.out.println("Ви ввели некоректне значення року" + e);
            }finally {
                System.out.println("Введіть нові значення");
            }
        } while (counter < 2);


        System.out.println(workers);
    }

}


