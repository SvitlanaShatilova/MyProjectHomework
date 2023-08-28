package Homework1006.MyDictionary;
import java.util.HashMap;
public class FabricDictionary {
    public HashMap<Integer, MyDictionary> myHashMap = new HashMap<Integer, MyDictionary>();
    public FabricDictionary(){this.myHashMap = myHashMap;}
    public FabricDictionary(HashMap<Integer, MyDictionary> myHashMap){
        this.myHashMap = myHashMap;}
    public void addPair(Integer val, MyDictionary myDictionary){
        myHashMap.put(val, myDictionary);}
    public void getElement(Integer val){
        System.out.println("Значення елементів за індексом " + val +" = " + myHashMap.get(val).toString());}
    public void getSize(){
        System.out.println("Загальна кількість пар елементів = " + myHashMap.size());}
}