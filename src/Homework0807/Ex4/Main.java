package Homework0807.Ex4;

import java.io.*;
import java.util.ArrayList;

/**Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 1. Створити перелік рядків.
 2. Ввести рядки з клавіатури та додати їх до списку.
 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
 4. Вивести рядки на екран, кожен з нового рядка.*/
public class Main {
    public static void main(String[] args) {
        try {
            InputStreamReader sr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(sr); // клас буферизації

            FileOutputStream fos = new FileOutputStream("strings.txt");
            PrintStream ps = new PrintStream(fos);

            String s;

            System.out.println("Введіть з клавіатури необхідну кількіть рядків. Для завершення вводу введіть: \"end\".");
            ArrayList <String> text = new ArrayList<>(); //Створити перелік рядків.

            do {
                s = br.readLine(); //Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
                if(!s.equals("end"))text.add(s);
                ps.println(s);
            } while (!s.equals("end"));

            System.err.println("//Вивести рядки на екран, кожен з нового рядка.");

            for (String temp: text){
                System.out.println(temp);
            };
            ps.close();

        } catch (IOException e){
            System.out.println(e);
    }
}
}
