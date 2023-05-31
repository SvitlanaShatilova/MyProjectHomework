package Homework2705.TestDrive;
/*Завдання TestDrive
Створити клас - якась невідома машина
Клас має поля
model - назва машини
power - від 0.0 до 200.0
speed - від 0 до 320
price - від 0.0 до 50000.0
yearOfManufacture - для всіх один рік 1967
Створити 4 екземляри машин
Ford
Mitsubishi
Toyota
KIA
Створити клас - CheckCar
Цей клас повинен:
- мати список машин які які будуть передавати на перевірку
- мати метод який отримує якусь машину і додає її в свій список
- мати метод який повертає найшвидшу машину
- мати метод який повертає найдорожчу машину
- мати метод який повертає найпотужнішу машину
- всі методи які повертають машини - найшвидшу/найдорожчу/найпотужнішу - мають вивести про неї всю інформацію у форматі
Brand: KIA Rio
Power: 600
Speed: 189
Price: 3458.90
Year:  1967
* Статичні змінні використовувати заборонено*/
public class Main {
    public static void main(String[] args) {
        Ford ford1 = new Ford("Ford Mustang", 257.0, 49, 110000.0);
        KIA kia1 = new KIA("KIA Rio", 260.0,290,56000.15);
        //ford1.infoCar();     //перевірка друку
       // kia1.infoCar();

       CheckCar checkCar = new CheckCar();
       checkCar.addListCar(ford1);
        checkCar.addListCar(kia1);

     // checkCar.printList(checkCar.checkCars);
      checkCar.printMaxSpeed(checkCar.checkCars);








    }
}
