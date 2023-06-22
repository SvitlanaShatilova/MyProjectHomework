package Homework1006.Ex9_MyClass;

import java.util.List;

/*Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).*/
public class Main {
    public static void main(String[] args) {
        List <String> name = MyClass.factoryMethod();
        name.add("A");
        name.add("B");
        name.add("C");

        List<Integer> num = MyClass.factoryMethod();
        num.add(1);
        num.add(2);
        num.add(3);

        List<Double> price = MyClass.factoryMethod();
        price.add(1.1);
        price.add(2.2);
        price.add(3.3);

        System.out.println(name);
        System.out.println(num);
        System.out.println(price);

    }
}
