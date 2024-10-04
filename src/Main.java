import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2024);
        osUpdate(true, 2025);
        System.out.println(deliveryDays(100));
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This year is leap");
        }
        else {
            System.out.println("This year isn't leap");
        }
    }

    public static void osUpdate(boolean type, int year) {
        int currentYear = LocalDate.now().getYear();
        String os;
        if (type) {
            os = "Android";
        }
        else {
            os = "iOS";
        }
        if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + os + " по ссылке");
        }
        else {
            System.out.println("Установите обычную версию приложения для " + os + " по ссылке");
        }
    }

    public static int deliveryDays(int distance) {
        int res = 0;
        if (distance < 20) {
            res += 1;
        } else if (distance < 60) {
            res += 2;
        } else if (distance < 100) {
            res += 3;
        } else {
            res = -1;
        }
        return res;
    }

}