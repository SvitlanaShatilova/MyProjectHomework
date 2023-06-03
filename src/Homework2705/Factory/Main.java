package Homework2705.Factory;

import java.util.Scanner;

/*Створити програму яка буде описувати виробництво меблів на фабриці.
У нас будуть три варіанта меблів - Ар-деко, Вікторіанській і Модерн.
Фабрика вміє виробляти - Крісло, Диван, Столик.
Крісло, Диван, Столик - мають мати ціну - X.X, назву - "XXX".
Стпроектувати програму таким чином, щоб користувач міг вибрати який варіант меблів він хоче отримати і фабрика це зробила.
Після вибору він отримав докладний звіт.
Також передбачити умову - якщо у нас зʼявляється новий виріб - наприклад Поличка то фабрика яка виробляє меблі після
адаптації могла працювати далі і не зломати весь наш процес.*/
public class Main {
    public static final String currency = "грн.";
    public static final String line = "----------------";
    public static final String version = "Який варіант набору Ви хотіли б придбати ?";

    public static void main(String[] args) {
        Fabric fabric = null;
        ArmChair armChair;
        Sofa sofa;
        Table table;

        Scanner scanner = new Scanner(System.in);
        System.out.println(line);
        System.out.println(version);
        System.out.println("1 -> Ар-деко\n2 -> Вікторіанській\n3 -> Модерн");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= 3) {
            switch (choice) {
                case 1:
                    fabric = new ArtDecoFabric();
                    break;
                case 2:
                    fabric = new VictorianFabric();
                    break;
                case 3:
                    fabric = new ModernFabric();
                    break;
            }

            armChair = fabric.createArmChair();
            sofa = fabric.createSofa();
            table = fabric.createTable();
            System.out.println(line);
            System.out.println("Ви обрали варіант: 2");
            System.out.println("Детальний опис:");
            System.out.printf("Крісло - \"%s\", %.2f %s\n", armChair.getName(), armChair.getPrice(), currency);
            System.out.printf("Диван - \"%s\", %.2f %s\n", sofa.getName(), sofa.getPrice(), currency);
            System.out.printf("Столик - \"%s\", %.2f %s\n", table.getName(), table.getPrice(), currency);
            System.out.printf("Загальна сумма: %.2f %s\n", (armChair.getPrice() + sofa.getPrice()+ table.getPrice()), currency);
            System.out.println(line);

        } else {
            System.out.println(line);
            System.out.println("ERROR! Ви ввели невірне значення");
        }
    }
}
