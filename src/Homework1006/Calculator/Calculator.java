package Homework1006.Calculator;
/*Створіть клас Calculator. У тілі класу створіть чотири методи для арифметичних дій:
(add – додавання, sub – віднімання, mul – множення, div – поділ). Метод поділу повинен перевірити поділ на нуль,
 якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення, над якими хоче зробити операцію
 та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.*/
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

        public void div ( int a, int b) {
            try {
                int c = a / b;
                System.out.println(c);
            } catch (Exception e){
                System.out.println("Ділення на нуль неможливе! " + e.getMessage());
            }finally {
                System.out.println("Програма завешила виконання");
            }

        }

}


