package Homework0807.Ex4;

import java.io.BufferedReader;
import java.util.Scanner;

/**Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 1. Створити перелік рядків.
 2. Ввести рядки з клавіатури та додати їх до списку.
 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
 4. Вивести рядки на екран, кожен з нового рядка.*/
public class Ex4_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Введіть з клавіатури необхідну кількіть рядків. Для завершення вводу введіть: \"end\".");
        do {
             s = scanner.nextLine();
            if(!s.equals("end"))sb.append(s);

        } while (!s.equals("end"));

        String str = sb.toString();
        String [] array = str.split("\\.");
        for (String temp : array){
            System.out.println(temp);
        }
    }
}
