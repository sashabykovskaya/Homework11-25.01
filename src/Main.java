import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isYearLeap(2021);
        determineOSVersion(0, 2015);
        determineOSVersion(1, 2023);
        int time1 = calculateTime(50);
        int time2 = calculateTime(100);
        System.out.println("Для дистанции 50 время = " + time1);
        System.out.println("Для дистанции 100 время = " + time2);
    }

    public static void isYearLeap(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void determineOSVersion(int osType, int deviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (osType == 0) {
            if (deviceYear == currentYear) {
                System.out.println("Устанавливаем облегченную iOS");
            } else {
                System.out.println("Устанавливаем обычную iOS");
            }
        } else {
            if (deviceYear == currentYear) {
                System.out.println("Устанавливаем облегченную android");
            } else {
                System.out.println("Устанавливаем обычную android");
            }
        }
    }
    public static int calculateTime (int distance) {
        System.out.println("Задача 3");
        int time = 1;
        if (distance <= 20 && distance <= 60) {
            ++time;
        }
        if (distance > 60 && distance <= 100) {
            ++time;
        }
        return time;
    }
}