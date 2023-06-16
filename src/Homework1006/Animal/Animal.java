package Homework1006.Animal;

import java.util.Objects;

/*Створити клас Animal з ім'ям String, int віком, хвостом Boolean. У класі перевизначити метод toString,
щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні». У класі Animal перевизначити методи equals & hashCode.*/
public class Animal {
    protected String name;
    protected int age;
    protected boolean hvist;

    public Animal(String name, int age, boolean hvist) {
        this.name = name;
        this.age = age;
        this.hvist = hvist;
    }

    @Override
    public String toString() {
        if (hvist == true) {
            return "«Ім'я: " + name + ", вік: " + age + ", хвіст: так»";
        } else {
            return "«Ім'я: " + name + ", вік: " + age + ", хвіст: ні»";
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && hvist == animal.hvist && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, hvist);
    }
}
