package Homework1006.Calculator;
/*Створіть клас Calculator. У тілі класу створіть чотири методи для арифметичних дій:
(add – додавання, sub – віднімання, mul – множення, div – поділ). Метод поділу повинен перевірити поділ на нуль,
 якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення, над якими хоче зробити операцію
 та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.*/
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 5));
        System.out.println(calculator.mul(5,6));
        System.out.println(calculator.sub(6,7));
        calculator.div(5,2);
        calculator.div(5, 0);


    }
}
