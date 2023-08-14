package Homework0807.Ex8;

import java.io.*;


/**Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники на слово «Java».
 * Завдання із зірочкою - перезаписати вміст файлу*/
public class Main {
    public static void main(String[] args) throws IOException {


        File f1 = new File("C:\\Users\\User\\IdeaProjects\\MyProjectHomework\\src\\Homework0807\\Ex8\\test.txt");

        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String temp = br.readLine();
        br.close();

       try{
           temp = temp.replaceAll("between", "JAVA");
           temp = temp.replaceAll("under", "JAVA");
           temp = temp.replaceAll("on", "JAVA");

           FileWriter fileWriter = new FileWriter(f1);
           fileWriter.write(temp);
           fileWriter.close();
           System.out.println("Successfully wrote to the file.");
       }catch (IOException e){
           System.out.println("Error");
           e.printStackTrace();
       }
    }
}