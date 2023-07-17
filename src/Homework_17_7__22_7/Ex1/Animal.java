package Homework_17_7__22_7.Ex1;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private String name;
    private int age;
    private boolean hvist;

    public Animal(String name, int age, boolean hvist) {
        this.name = name;
        this.age = age;
        this.hvist = hvist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHvist() {
        return hvist;
    }

    public void setHvist(boolean hvist) {
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

