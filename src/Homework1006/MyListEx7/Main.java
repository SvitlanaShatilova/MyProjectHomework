package Homework1006.MyListEx7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.name = "TEST";
        MyList myList1 = new MyList();
        ArrayList <MyList> myLists = new ArrayList<>();

        myList.addNew(myLists, myList);
        myList.addNew(myLists, myList1);

        System.out.println(myList.getElement(myLists, 0));
        System.out.println(myList.getElement(myLists, 1));

        System.out.println(myList.readElement(myLists));

    }
}
