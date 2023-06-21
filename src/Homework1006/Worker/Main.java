package Homework1006.Worker;

/*Описати клас з ім'ям Worker, що містить такі поля:
  прізвище та ініціали працівника;
  назва посади;
  рік надходження на роботу.
Написати програму, яка виконує такі дії:
  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
  якщо значення року введено не у відповідному форматі, видає виняток.
  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.*/

import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані 5-ти працівників: \n -> Прізвище та ініціали \n -> Назву посади \n -> Рік надходження на роботу");
        ArrayList<Worker> workers = new ArrayList<>();

        do {
            try {
                System.out.println("Працівник №" + counter);
                System.out.println("ПІБ: ");
                String name = scanner.nextLine();
                System.out.println("Посада: ");
                String posada = scanner.nextLine();
                System.out.println("Рік прийняття на роботу: ");
                int rik = scanner.nextInt();
                if (rik < 1990 || rik > 2023) {
                    throw new Exception("Ви ввели некоректне значення року");
                } else {Worker worker = new Worker(name, posada, rik);
                    workers.add(worker);
                    counter++;
                }
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Введіть нові значення");
            }
        } while (counter < 6);
        Collections.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.pib.compareTo(o2.pib);
            }
        });

        System.out.println("***************************");
        System.out.println("перевірка сортування списку");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
        System.out.println("***************************");

        System.out.println("Введіть ціле значення, щоб дізнатися стаж роботи у кого перевищує введене значення");
        int val = scanner.nextInt();
        Worker.searchStaj(val, workers);
    }
}
