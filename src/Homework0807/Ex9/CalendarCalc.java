package Homework0807.Ex9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarCalc {
    private int year;
    private int  month;
    private int  date;
    private int  hour;
    private int  minute;
    private int  second;

    public CalendarCalc(int year, int month, int date, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getPeriodBorn(CalendarCalc o){
        Calendar calendar = new GregorianCalendar();
        calendar.set(o.getYear(), o.getMonth(), o.getDate(), o.getHour(), o.getMinute(), o.getSecond());
        Calendar calendar2 = Calendar.getInstance();
        System.out.println("============================");
        System.out.println("Поточна дата: " + calendar2.getTime());
        System.out.println("Дата народження: " + calendar.getTime());
        System.out.println("***");

        int dayNaw = calendar2.get(Calendar.DAY_OF_MONTH);
        int dayBorn = calendar.get(Calendar.DAY_OF_MONTH);
        int monthNow = calendar2.get(Calendar.MONTH);
        int monthBorn = calendar.get(Calendar.MONTH);
        int years = (calendar2.getWeekYear() - calendar.getWeekYear());

        int yearsOld;
        int monthOld;

//рахуємо скільки виповнилося повних років:
        if (monthNow < monthBorn){
            yearsOld = years-1;
        }else if (monthNow > monthBorn){
            yearsOld = years;
        }else {
            if (dayNaw >= dayBorn) {
                yearsOld = years;
            } else {
                yearsOld = years - 1;
            }
        }
//рахуємо кількість місяців:
        if (monthNow<monthBorn){
            monthOld = (monthNow+12-monthBorn);
        } else if (monthNow>monthBorn) {
            monthOld = monthNow - monthBorn;
        }else {
            monthOld = 0;
        }

//блок для перевірки кількості днів у місяці
        Calendar temp30 = Calendar.getInstance();
        temp30.add(Calendar.DAY_OF_MONTH, 30);
        Calendar temp31 = Calendar.getInstance();;
        temp31.add(Calendar.DAY_OF_MONTH, 31);
        Calendar temp28 = Calendar.getInstance();;
        temp28.add(Calendar.DAY_OF_MONTH, 28);
        Calendar temp29 = Calendar.getInstance();;
        temp29.add(Calendar.DAY_OF_MONTH, 29);

//розрахунок кількості днів:
        int dayOld;
        int t28 = (temp28.get(Calendar.DAY_OF_MONTH));
        int t29 = (temp29.get(Calendar.DAY_OF_MONTH));
        int t30 = (temp30.get(Calendar.DAY_OF_MONTH));
        if (dayNaw>dayBorn){
            dayOld = dayNaw - dayBorn;
        }else if (dayNaw<dayBorn){
            if (dayBorn == t28){
                dayOld = dayNaw + 28 - dayBorn;
            }else if (dayBorn == t29) {
                dayOld = dayNaw + 29 - dayBorn;
            }else if (dayBorn == t30) {
                dayOld = dayNaw + 30 - dayBorn;
            }else {
                dayOld = dayNaw + 31 - dayBorn;
            }
        }else {
            dayOld = 0;
        }
//розрахунок годин:
        int hourNow =  calendar2.get(Calendar.HOUR_OF_DAY);
        int hourBorn = calendar.get(Calendar.HOUR_OF_DAY);
        int hourOld;
        if (hourNow>hourBorn){
            hourOld = (24 - hourNow) + hourBorn;
        } else if (hourNow<hourBorn) {
            hourOld = hourNow - hourBorn;
        }else {
            hourOld = 0;
        }
//розрахунок хвилин:
        int minNow =  calendar2.get(Calendar.MINUTE);
        int minBorn = calendar.get(Calendar.MINUTE);
        int minOld;
        if (minNow<minBorn){
            minOld = (60 - minBorn) + minNow;
        } else if (minNow>minBorn) {
            minOld = minNow - minBorn;
        }else {
            minOld = 0;
        }
//розрахунок секунд:
        int secNow =  calendar2.get(Calendar.SECOND);
        int secBorn = calendar.get(Calendar.SECOND);
        int secOld;
        if (secNow<secBorn){
            secOld = (60 - secBorn) + secNow;
        } else if (secNow>secBorn) {
            secOld = secNow - secBorn;
        }else {
            secOld = 0;
        }

        return "«Вам виповнилося " + yearsOld +" роки(ів), " + monthOld + " місяць(ів), "
                + dayOld + " дні(в), " + hourOld + " годин(и), " + minOld + " хвилин(и) та " + secOld + " секунд(и)»";
    }
}
