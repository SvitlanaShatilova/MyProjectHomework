package Homework1006.MyListEx7;


import java.util.Arrays;

/**Створіть клас MyList.
Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для
отримання загальної кількості елементів.*/
public class MyList {

    public String[] myLists = new String[0];


    public String[] add(String s) {
        String[] temp = new String[myLists.length + 1];
        String val = s;
        for (int i = 0; i < myLists.length; i++) {
            if (i == myLists.length) {
                temp[i] = val;
            } else temp[i] = myLists[i];
        }
//        for (int i = 0; i < temp.length; i++) {
//
//            myLists[i] = temp[i];


//        }
        return temp;
    }

//    public  String[]myList addOne(){
//        String [] t = new String[myLists.length+1];
//        for (int i =0; i< myLists.length; i++){
//            temp[i] = myLists[i];
//        }
//        return myLists;
//        }

        @Override
        public String toString () {
            return "MyList{" +
                    "myLists=" + Arrays.toString(myLists) +
                    '}';
        }
    }








