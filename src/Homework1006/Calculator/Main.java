package Homework1006.Calculator;

import java.util.Scanner;

/*Створіть клас Calculator. У тілі класу створіть чотири методи для арифметичних дій:
(add – додавання, sub – віднімання, mul – множення, div – поділ). Метод поділу повинен перевірити поділ на нуль,
 якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення, над якими хоче зробити операцію
 та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.*/
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean error = false;
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введіть перше ціле число з яким будуть здійснюватися операції ");
                val1 = scanner.nextInt();
                System.out.println("Введіть друге ціле число з яким будуть здійснюватися операції ");
                val2 = scanner.nextInt();
                System.out.println("Введіть операцію, яку будете здійснювати з введеними числами: \n 1 -> додавання (add) \n 2 -> віднімання (sub) \n 3 -> множення (mul) \n 4 -> ділення (div)");
                val3 = scanner.nextInt();
                error = false;
            } catch (Exception pomilka) {
                error = true;
                System.out.println("Ви ввели невірні значення! / " + pomilka);
                System.out.println("Повторіть спробу!!!");
            }
        }
        while (error);

        switch (val3) {
            case (1):
                System.out.println("Результат = " + calculator.add(val1, val2));
                break;
            case (2):
                System.out.println("Результат = " + calculator.sub(val1, val2));
                break;
            case (3):
                System.out.println("Результат = " + calculator.mul(val1, val2));
                break;
            case (4):
                System.out.print("Результат = ");
                calculator.div(val1, val2);
                break;
        }
    }
}
