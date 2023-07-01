package Homework1006.MyListEx7;

import java.util.ArrayList;

/*Створіть клас MyList.
Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для
отримання загальної кількості елементів.*/
public class MyList {

    String name;

    public MyList() {
    }

    public ArrayList<MyList> addNew(ArrayList<MyList> my, MyList myList) {
        ArrayList <MyList> temp = my;
        temp.add(myList);
         return temp;
    }

    public MyList getElement(ArrayList<MyList> my, int index){
        ArrayList <MyList> temp = my;
        return temp.get(index);
    }

    public String readElement(ArrayList<MyList> my){
        ArrayList <MyList> temp = my;
        return "Загальна кількість елементів = " + temp.size();
    }

    @Override
    public String toString() {
        return "MyList{" +
                "name='" + name + '\'' +
                '}';
    }
}




