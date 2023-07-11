package Homework0807;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Створили об'єкт файлу за посиланням
        File f1 = new File("C:\\Users\\User\\IdeaProjects\\MyProjectHomework\\src\\Homework0807\\example");

        // Зчитуємо текстовий файл у пакеті
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String temp = null;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
        FileWriter fw = new FileWriter(f1, true);  // Залишити коментар
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Good");
        pw.println("Luck");
        pw.flush();
        pw.close();
    }
}