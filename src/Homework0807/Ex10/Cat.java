package Homework0807.Ex10;

import java.lang.reflect.Field;

/**Створіть 2 класи, Animal та Cat.
 У класі Animal ініціалізуйте 3 поля різних модифікаторів.
 У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
 * Завдання із зірочкою
 Додайте модифікатори
 Final
 Static*/
public class Cat {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            try {

                Class cl = Animal.class;
                System.out.println(cl);
                Field[] field = cl.getDeclaredFields();
                for (Field temp : field) {
                    System.out.println("Name = " + temp.getName());
                    System.out.println("Type = " + temp.getType());
                }
                System.out.println("===============================");

                Animal animal = new Animal();

                Field field1 = cl.getDeclaredField("vid");
                field1.setAccessible(true);
                System.out.println("vid old = " + animal.getVid());
                field1.set(animal, "Cat");
                System.out.println("vid new = " + animal.getVid());
                field1.setAccessible(false);
                Field field2 = cl.getDeclaredField("age");
                field2.setAccessible(true);
                System.out.println("age old = " + animal.getAge());
                field2.set(animal, 8);
                field2.setAccessible(false);
                System.out.println("age new = " + animal.getAge());
                Field field3 = cl.getDeclaredField("name");
                field3.setAccessible(true);
                System.out.println(animal.name);
                field3.set(animal, "Kitty");
                field3.setAccessible(false);
                System.out.println(" new name = " + animal.name);


        } catch (IllegalAccessException ex) {
                System.out.println("name змінити неможливо ! " + ex);

        }} catch (Exception e) {
            e.printStackTrace();
        }
    }
}

