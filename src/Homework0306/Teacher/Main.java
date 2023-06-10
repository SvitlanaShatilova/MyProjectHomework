package Homework0306.Teacher;

import java.util.ArrayList;

/*Створити class Main, у ньому створити список, додати вчителів, яких ви зможете згадати зі школи.
І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> teacher = new ArrayList<>();
        teacher.add("Марина Михайлівна");
        teacher.add("Тетяна Пантелеївна");
        teacher.add("Людмила Георгіїва");
        teacher.add("Ігор Володимирович");
        teacher.add("Вікторія Володимирівна");


        int bestTeacher = teacher.indexOf("Вікторія Володимирівна");
        int bedTeacher = teacher.indexOf("Тетяна Пантелеївна");

        System.out.println("Найкращий вчитель - " + teacher.get(bestTeacher));
        System.out.println("Вчитель не дуже - " + teacher.get(bedTeacher));



    }
}
