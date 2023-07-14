package Homework0807.Ex10;
/**Створіть 2 класи, Animal та Cat.
 У класі Animal ініціалізуйте 3 поля різних модифікаторів.
 У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
 * Завдання із зірочкою
 Додайте модифікатори
 Final
 Static*/
public class Animal {
    private String vid = "Dog";
    final static String name = "Bulya";
    private int age = 5;

    public String getVid() {
        return vid;
    }

    public int getAge() {
        return age;
    }
}
