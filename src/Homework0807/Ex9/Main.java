package Homework0807.Ex9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**Спроектуйте та розробіть метод, який визначає, скільки часу пройшло із заданої дати.
 *  За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному
 *  для сприйняття вигляді, наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».*/
public class Main {
    public static void main(String[] args) {

        Calendar dateborn = new GregorianCalendar(1981, Calendar.JUNE, 10);
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = dateborn.getTime();
        System.out.println(date);
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
       // LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        System.out.println("=============");

        // Злиття 2-х об'єктів
        LocalDateTime fromLocalTime = localTime.atDate(localDate);
        LocalDateTime fromDateTime = localDate.atTime(localTime);

        System.out.println(fromDateTime);
        System.out.println(fromLocalTime);

        System.out.println("=============");

        fromDateTime = localDate.atTime(12,00,57,01);
        System.out.println(fromDateTime);

        System.out.println("=============");
        localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(localDate);

    }
}