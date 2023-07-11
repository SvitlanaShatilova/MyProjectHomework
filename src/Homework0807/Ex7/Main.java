package Homework0807.Ex7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
 Виведіть на екран вміст файлу*/
public class Main {
         public static void main(String[] args) throws Exception {
            // Створили об'єкт файлу за посиланням
            File file = new File("C:\\Users\\User\\IdeaProjects\\MyProjectHomework\\src\\Homework0807\\Ex7\\file.txt");

            // Зчитуємо текстовий файл у пакеті
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp = null;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
         }
    }

