package Homework1006.MyDictionary;

public class Main {

    public static void main(String[] args) {
        FabricDictionary fabricDictionary = new FabricDictionary();
        MyDictionary myDictionary1 = new MyDictionary ("індексатор ", "indexer");
        MyDictionary myDictionary2 = new MyDictionary ("елемент ", "element");
        fabricDictionary.addPair(1, myDictionary1);
        fabricDictionary.addPair(2, myDictionary2);
        fabricDictionary.getElement(1);
        fabricDictionary.getElement(2);
        fabricDictionary.getSize();
    }
}