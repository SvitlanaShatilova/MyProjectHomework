package Homework1006.Ex9_MyClass;

import java.util.ArrayList;
import java.util.List;

/*Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).*/
public class MyClass {

    public static <T> List<T> factoryMethod(){
        return new ArrayList<>();

    }
}
