package Homework2705.TestDrive;

/*Цей клас повинен:
- мати список машин які які будуть передавати на перевірку
- мати метод який отримує якусь машину і додає її в свій список
- мати метод який повертає найшвидшу машину
- мати метод який повертає найдорожчу машину
- мати метод який повертає найпотужнішу машину*/
public class CheckCar {
    protected CheckCar[] checkCars = new CheckCar[0];

    public CheckCar() {

    }
        public void addListCar(UnknownCar car) {
        checkCars = increaseLength(checkCars);
  //      checkCars[checkCars.length - 1] = car; //помилка?
    }


    public CheckCar[] increaseLength(CheckCar[] car) {
        CheckCar[] temp = new CheckCar[car.length + 1];
        for (int i = 0; i <= car.length; i++) {
            if (i != car.length) {
                temp[i] = car[i];
            }
        }
        return temp;
    }

//    public void printList(UnknownCar[] unknownCars) {
//        for (int i = 0; i < unknownCars.length; i++) {
//            unknownCars[i].infoCar();
//        }
//    }
//    public void maxSpeedCar(UnknownCar[] unknownCars){
//        UnknownCar [] maxSpeedCar = new UnknownCar[1];
//        maxSpeedCar[0] = unknownCars[0];
//        for (int i =0; i<unknownCars.length-1; i++){
//            if (maxSpeedCar[0].speed<unknownCars[i].speed) maxSpeedCar[0]=unknownCars[i];
//        }for (UnknownCar i : maxSpeedCar) System.out.print(i);
//    }
//    public void printMaxSpeed(UnknownCar[] unknownCars){
//        UnknownCar [] printMaxSpeed = maxSpeedCar(unknownCars);
//        printMaxSpeed[0].infoCar();
//    }
}