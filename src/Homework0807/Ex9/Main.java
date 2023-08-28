package Homework0807.Ex9;



import java.util.Calendar;
import java.util.GregorianCalendar;

/**Спроектуйте та розробіть метод, який визначає, скільки часу пройшло із заданої дати.
 *  За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному
 *  для сприйняття вигляді, наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».*/
public class Main {

    public static void main(String[] args) {

        CalendarCalc seta = new CalendarCalc(2007, 11, 4, 15,40,45);
        System.out.println("Свєта = " + seta.getPeriodBorn(seta));

        CalendarCalc esha = new CalendarCalc(2009, 2, 22, 10,00,00);
        System.out.println("Єша = " + esha.getPeriodBorn(esha));
//місяць в програмі від 0 до 11 відповідно реальним 1 - 12
        CalendarCalc eshaKiril = new CalendarCalc(2023, 0, 21, 18,00,00);
        System.out.println("Єша Kiril = " + eshaKiril.getPeriodBorn(eshaKiril));

    }
}