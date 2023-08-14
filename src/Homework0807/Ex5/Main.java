package Homework0807.Ex5;

import java.io.*;
/**Створіть файл, запишіть у нього довільні дані та закрийте файл.
 Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.*/
public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\User\\IdeaProjects\\MyProjectHomework\\src\\Homework0807\\Ex5\\Text.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String temp = null;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("*Створіть файл, запишіть у нього довільні дані та закрийте файл.\n" +
                " Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.*");
        pw.flush();
        pw.close();

    }
}