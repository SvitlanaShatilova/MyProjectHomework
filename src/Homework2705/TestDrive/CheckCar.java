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
        checkCars[checkCars.length - 1] = car;
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
        for (int i =0; i<unknownCars.length; i++){
            if (unknownCars[i].speed > maxSpeedCar[0].speed) maxSpeedCar[0]=unknownCars[i];
        }return maxSpeedCar;
    }
    public void printMaxSpeed(UnknownCar[] unknownCars){
        UnknownCar [] printMaxSpeed = maxSpeedCar(unknownCars);
        printList(printMaxSpeed);
    }
    public UnknownCar[] maxPriceCar(UnknownCar[] unknownCars){
        UnknownCar [] maxPriceCar = new UnknownCar[1];
        maxPriceCar[0] = unknownCars[0];
        for (int i =0; i<unknownCars.length; i++){
            if (unknownCars[i].price > maxPriceCar[0].price) maxPriceCar[0]=unknownCars[i];
        }return maxPriceCar;
    }
    public void printMaxPrice(UnknownCar[] unknownCars){
        UnknownCar [] printMaxPrice = maxPriceCar(unknownCars);
        printList(printMaxPrice);
    }
    public UnknownCar[] maxPowerCar(UnknownCar[] unknownCars){
        UnknownCar [] maxPowerCar = new UnknownCar[1];
        maxPowerCar[0] = unknownCars[0];
        for (int i =0; i<unknownCars.length; i++){
            if (unknownCars[i].power > maxPowerCar[0].power) maxPowerCar[0]=unknownCars[i];
        }return maxPowerCar;
    }
    public void printMaxPower(UnknownCar[] unknownCars){
        UnknownCar [] printMaxPower = maxPowerCar(unknownCars);
        printList(printMaxPower);
    }
}