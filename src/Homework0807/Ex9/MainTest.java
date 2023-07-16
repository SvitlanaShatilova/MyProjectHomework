//package Homework0807.Ex9;
//
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//public class MainTest {
//
//
//    /**Спроектуйте та розробіть метод, який визначає, скільки часу пройшло із заданої дати.
//     *  За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному
//     *  для сприйняття вигляді, наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».*/
//
//        public static void main(String[] args) {
//            CalendarCalc myDay = new CalendarCalc(1981, 5, 10, 15, 40, 10);
//            System.out.println(myDay.getPeriodBorn(myDay));
//
//
//            Calendar calendar = new GregorianCalendar();
//            calendar.set(1981, Calendar.JUNE, 10, 15, 40, 10);
//            Calendar calendar2 = Calendar.getInstance();
//            System.out.println("Поточна дата: " + calendar2.getTime());
//            System.out.println("Дата народження: " + calendar.getTime());
//
//            System.out.println("============================");
//
//            int dayNaw = calendar2.get(Calendar.DAY_OF_MONTH);
//            int dayBorn = calendar.get(Calendar.DAY_OF_MONTH);
//            int monthNow = calendar2.get(Calendar.MONTH);
//            int monthBorn = calendar.get(Calendar.MONTH);
//            int years = (calendar2.getWeekYear() - calendar.getWeekYear());
//
//            int yearsOld;
//            int monthOld;
//
////рахуємо скільки виповнилося повних років:
//            if (monthNow < monthBorn){
//                yearsOld = years-1;
//            }else if (monthNow > monthBorn){
//                yearsOld = years;
//            }else {
//                if (dayNaw >= dayBorn) {
//                    yearsOld = years;
//                } else {
//                    yearsOld = years - 1;
//                }
//            }
////рахуємо кількість повних місяців:
//            if (monthNow<monthBorn){
//                monthOld = (monthNow+12-monthBorn);
//            } else if (monthNow>monthBorn) {
//                monthOld = monthNow - monthBorn;
//            }else {
//                monthOld = 0;
//            }
//
//            // блок для перевірки кількості днів у місяці
//            Calendar temp30 = Calendar.getInstance();
//            temp30.add(Calendar.DAY_OF_MONTH, 30);
//            Calendar temp31 = Calendar.getInstance();;
//            temp31.add(Calendar.DAY_OF_MONTH, 31);
//            Calendar temp28 = Calendar.getInstance();;
//            temp28.add(Calendar.DAY_OF_MONTH, 28);
//            Calendar temp29 = Calendar.getInstance();;
//            temp29.add(Calendar.DAY_OF_MONTH, 29);
////        System.out.println("********************");
////        System.out.println(temp28.get(Calendar.DAY_OF_MONTH));
////        System.out.println(temp29.get(Calendar.DAY_OF_MONTH));
////        System.out.println(temp30.get(Calendar.DAY_OF_MONTH));
////        System.out.println(temp31.get(Calendar.DAY_OF_MONTH));
////        System.out.println("********************");
//
////розрахунок кількості днів:
//            int dayOld;
//            int t28 = (temp28.get(Calendar.DAY_OF_MONTH));
//            int t29 = (temp29.get(Calendar.DAY_OF_MONTH));
//            int t30 = (temp30.get(Calendar.DAY_OF_MONTH));
//            if (dayNaw>dayBorn){
//                dayOld = dayNaw - dayBorn;
//            }else if (dayNaw<dayBorn){
//                if (dayBorn == t28){
//                    dayOld = dayNaw + 28 - dayBorn;
//                }else if (dayBorn == t29) {
//                    dayOld = dayNaw + 29 - dayBorn;
//                }else if (dayBorn == t30) {
//                    dayOld = dayNaw + 30 - dayBorn;
//                }else {
//                    dayOld = dayNaw + 31 - dayBorn;
//                }
//            }else {
//                dayOld = 0;
//            }
//            //розрахунок годин, хвилин, секунд:
//
//            int hourNow =  calendar2.get(Calendar.HOUR_OF_DAY);
//            int hourBorn = calendar.get(Calendar.HOUR_OF_DAY);
//            int hourOld;
//            if (hourNow>hourBorn){
//                hourOld = (24 - hourNow) + hourBorn;
//            } else if (hourNow<hourBorn) {
//                hourOld = hourNow - hourBorn;
//            }else {
//                hourOld = 0;
//            }
//
//            int minNow =  calendar2.get(Calendar.MINUTE);
//            int minBorn = calendar.get(Calendar.MINUTE);
//            int minOld;
//            if (minNow<minBorn){
//                minOld = (60 - minBorn) + minNow;
//            } else if (minNow>minBorn) {
//                minOld = minNow - minBorn;
//            }else {
//                minOld = 0;
//            }
//
//            int secNow =  calendar2.get(Calendar.SECOND);
//            int secBorn = calendar.get(Calendar.SECOND);
//            int secOld;
//            if (secNow<secBorn){
//                secOld = (60 - secBorn) + secNow;
//            } else if (secNow>secBorn) {
//                secOld = secNow - secBorn;
//            }else {
//                secOld = 0;
//            }
//
//
//            System.out.println("«Вам виповнилося " + yearsOld +" роки(ів), " + monthOld + " місяць(ів), "
//                    + dayOld + " дні(в), " + hourOld + " годин(и), " + minOld + " хвилин(и) та " + secOld + " секунд»");
//
//            System.out.println(yearsOld);
//            System.out.println(monthOld);
//            System.out.println(dayOld);
//            System.out.println(hourOld);
//            System.out.println(minOld);
//            System.out.println(secOld);
//
//            System.out.println("=============перевірка===============");
//            System.out.println("monthNow = " + monthNow);
//            System.out.println("monthBorn = " + monthBorn);
//            System.out.println("dayNaw = " + dayNaw);
//            System.out.println("dayBorn = " + dayBorn);
//            System.out.println("hourNow = " + hourNow);
//            System.out.println("hourBorn = " + hourBorn);
//            System.out.println("minNow = " + minNow);
//            System.out.println("minBorn = " + minBorn);
//            System.out.println("secNow = " + secNow);
//            System.out.println("secBorn = " + secBorn);
//
//        }
//    }
//
