package Homework1006.MyListEx7;

import java.util.ArrayList;
import java.util.List;

/*Створіть клас MyList.
Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для
отримання загальної кількості елементів.*/
public class MyList implements MyList_Interface{
    ArrayList<String> myList = new ArrayList<>();

    @Override
    public void addElement(int index, String name) {
        myList.add(index, name);

    }

    @Override
    public void getElement(int index) {
        System.out.println(myList.get(index));
    }

    @Override
    public void readElement() {
        System.out.println(myList.size());
        }

    public static void main(String[] args) { //перевірка методів
        MyList myList1 = new MyList();
        myList1.addElement(0, "Hello");
        myList1.getElement(0);
        myList1.readElement();
    }
    }


