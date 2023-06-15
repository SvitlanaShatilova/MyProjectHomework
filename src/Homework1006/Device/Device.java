package Homework1006.Device;
/*Створити класи:
1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу.
 Конструктор.
5.1 Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024*/
class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " + "manufacturer =" + manufacturer +", price=" + (int)price + ", serialNumber=" + serialNumber;
    }

    public class Monitor {
        private int resolutionX;
        private int resolutionY;

        public Monitor(int resolutionX, int resolutionY) {
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;
        }

        public void accessMethod(String manufact, float pri, String serialNum) {
            manufacturer = manufact;
            price = pri;
            serialNumber = serialNum;
        }

        @Override
        public String toString() {
            return "Monitor: " + "manufacturer =" + manufacturer +", price=" + (int)price + ", serialNumber=" + serialNumber + ", X="+resolutionX + "Y=" + resolutionY;
        }
    }

    public class EthernetAdapter {
        private int speed;
        private String mac;

        public void accessMethod(String manufact, float pri, String serialNum) {
            manufacturer = manufact;
            price = pri;
            serialNumber = serialNum;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
