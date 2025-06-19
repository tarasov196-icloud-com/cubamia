
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task 1
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год невисокосный");
        }

        suggestAppVersion(1, 2025);
        suggestAppVersion(0, 2014);

        int deliveryDistance = 95;
        int daysForDelivery = calculateDeliveryDays(deliveryDistance);
        if (daysForDelivery == -1) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Потребуется дней " + daysForDelivery);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        // task 2


    }

    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = osType == 0 ? "iOS" : "Android";
        String version = deviceYear < currentYear ? "облегченную" : "обычную";
        String message = String.format("Установите " + version + " версию приложения для " + osName + " по ссылке");
        System.out.println(message);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}

