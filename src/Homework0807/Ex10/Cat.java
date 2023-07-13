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
    public static void main(String[] args) {
       try {
           Class cl = Animal.class;
           System.out.println(cl);
           Field[] field = cl.getDeclaredFields();
           for (Field temp : field) {
               Class fildType = temp.getType();
               System.out.println("Name = " + temp.getName());
               System.out.println("Type = " + fildType.getName());
           }
               Animal animal = new Animal();
               Field field1 = cl.getDeclaredField("age");
               field1.setAccessible(true);
               System.out.println("age old = " + field1.getInt(animal));
               field1.setInt(animal, 222);
               System.out.println("age new = " + field1.getInt(animal));




       }catch (Exception ex){
           ex.printStackTrace();
       }
    }
}
