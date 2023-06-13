package Homework1006.Animals;
/*Створіть перерахунковий тип (enum) Animals, що містить конструктор, який повинен набувати цілого числа (вік тварини),
 і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.*/
public enum Animals {
    DOG (7),
    CAT(8),
    TIGER(9),
    LION(6),
    BEAR(5);
    private int age;

    Animals(int age) {
        this.age = age;
    }


    public String toString(Animals animals) {
        return "Animals{" + animals +
                " age=" + age +
                '}';
    }
}
