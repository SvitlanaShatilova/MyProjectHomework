package Homework1006.Animal;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Васька", 4, false);
        System.out.println(cat.toString());
        Animal dog = new Animal("Валька", 3, true);
        System.out.println(dog.toString());

    }
}
