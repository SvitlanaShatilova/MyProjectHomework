package Homework1006.Device;
/*Створити класи:
1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу.
 Конструктор.
5.1 Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024*/
public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device.Monitor monitor= new Device("Samsung", 120, "AB1234567CD").new Monitor(1280, 1024);

        System.out.println(device);
        System.out.println(monitor);
    }
}
