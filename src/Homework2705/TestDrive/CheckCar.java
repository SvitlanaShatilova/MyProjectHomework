package Homework2705.TestDrive;

/*Цей клас повинен:
- мати список машин які які будуть передавати на перевірку
- мати метод який отримує якусь машину і додає її в свій список
- мати метод який повертає найшвидшу машину
- мати метод який повертає найдорожчу машину
- мати метод який повертає найпотужнішу машину*/
public class CheckCar {
    protected UnknownCar[] checkCars = new UnknownCar[0];

    public CheckCar() {

    }
        public void addListCar(UnknownCar car) {
        checkCars = increaseLength(checkCars);
        checkCars[checkCars.length - 1] = car; //помилка?
    }


    public UnknownCar[] increaseLength(UnknownCar[] car) {
        UnknownCar[] temp = new UnknownCar[car.length + 1];
        for (int i = 0; i <= car.length; i++) {
            if (i != car.length) {
                temp[i] = car[i];
            }
        }
        return temp;
    }

    public void printList(UnknownCar[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i].infoCar();
        }
    }
    public UnknownCar[] maxSpeedCar(UnknownCar[] unknownCars){
        UnknownCar [] maxSpeedCar = new UnknownCar[1];
        maxSpeedCar[0] = unknownCars[0];
        for (int i =0; i<unknownCars.length-1; i++){
            if (unknownCars[i].speed > maxSpeedCar[0].speed) maxSpeedCar[0]=unknownCars[i];
        }return maxSpeedCar;
    }
    public void printMaxSpeed(UnknownCar[] unknownCars){
        UnknownCar [] printMaxSpeed = maxSpeedCar(unknownCars);
        printList(printMaxSpeed);
    }
}