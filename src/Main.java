import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isYearLeap(2021);
        determineOSVersion(0, 2014);
        determineOSVersion(1, 2023);
        int time1 = calculateTime(50);
        int time2 = calculateTime(100);
        int time3 = calculateTime(101);
        System.out.println("Для дистанции 50 время = " + time1);
        System.out.println("Для дистанции 100 время = " + time2);
        System.out.println("Для дистанции свыше 100 - доставки нет");
    }

    public static void isYearLeap(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void determineOSVersion(int clientOS, int deviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && deviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && deviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 3");
    }
    public static int calculateTime(int distance) {
        int time = 1;
        if (distance <= 20 && distance <= 60) {
            ++time;
        }
        if (distance > 60 && distance <= 100) {
            ++time;
        }
        if (distance > 100) {
            ++time;
        }
        return time;
    }
}