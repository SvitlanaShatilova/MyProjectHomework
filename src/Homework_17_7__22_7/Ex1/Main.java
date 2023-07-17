package Homework_17_7__22_7.Ex1;

import java.io.*;

/** Необхідно здійснити десеріалізацію з файлу будь якого файлу(класу) та вивести на екран вміст.*/
public class Main {
    public static void main(String[] args) {
        File animalFile = new File("C:\\Users\\User\\IdeaProjects\\MyProjectHomework\\src\\Homework_17_7__22_7\\Ex1\\animal.txt");
        Animal cat = new Animal("Васька", 4, false);
        Animal dog = new Animal("Валька", 3, true);

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(animalFile));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(animalFile));
            oos.writeObject(cat);
            oos.writeObject(dog);
            oos.close();

            Animal animalRead = (Animal) ois.readObject();
            Animal animalRead2 = (Animal) ois.readObject();
            System.out.println(animalRead);
            System.out.println(animalRead2);
            ois.close();

        }catch (IOException |ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}