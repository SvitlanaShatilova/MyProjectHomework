package Homework1006.MyListEx7;
/** Створіть клас MyList.
 * Реалізуйте у найпростішому наближенні можливість використання його екземпляра
 * аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з
 * екземпляром повинен включати метод додавання елемента, індексатор для отримання
 * значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.
 */

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList("My List 1", 1);
        MyList myList2 = new MyList("My List 2", 2);
        MyList myList3 = new MyList("My List 3", 3);

        MethodList methodList = new MethodList();

        methodList.add(myList);
        methodList.add(myList2);
        methodList.add(myList3);
        methodList.getIndex(0);
        methodList.getIndex(1);
        methodList.getIndex(2);
        methodList.readLenth();
    }
}