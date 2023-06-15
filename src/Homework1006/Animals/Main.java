package Homework1006.Animals;
/*Створіть перерахунковий тип (enum) Animals, що містить конструктор, який повинен набувати цілого числа (вік тварини),
 і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.*/
public class Main {
    public static void main(String[] args) {
        Animals animals1 = Animals.BEAR;
        System.out.println(animals1.toString(animals1));

        Animals animals2 = Animals.CAT;
        System.out.println(animals2.toString(animals2));

        Animals animals3 = Animals.DOG;
        System.out.println(animals3.toString(animals3));

        Animals animals4 = Animals.LION;
        System.out.println(animals4.toString(animals4));

        Animals animals5 = Animals.TIGER;
        System.out.println(animals5.toString(animals5));



    }
}
