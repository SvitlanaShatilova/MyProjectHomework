package Homework1006.MyListEx7;

public class MethodList {
    private MyList [] myLists = new MyList[0];

    public MethodList() {
    }

    public MethodList(MyList[] myList) {
        this.myLists = myLists;
    }

    public void add(MyList myList) {
        myLists = increaseLength(myLists);
        myLists[myLists.length - 1] = myList;
    }


    public static MyList[] increaseLength(MyList[] myList) {
        MyList[] temp = new MyList[myList.length + 1];
        for (int i = 0; i <= myList.length; i++) {
            if (i != myList.length) {
                temp[i] = myList[i];
            }
        }
        return temp;
    }

    public void getIndex(int index){
        System.out.println(myLists[index]);
    }
    public void readLenth(){
        System.out.println(myLists.length);
    }
}