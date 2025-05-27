import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
            System.out.println("Задача 2");
            clientOS = 0;
            int clientDeviceYear = 2014;
            if (clientOS == 0) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                if (clientOS == 1) {
                    if (clientDeviceYear < 2015) {
                        System.out.println("Установите версию приложения для iOS по ссылке ");
                    } else {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                }
            }
        }
        System.out.println("Задача 3");
        int yearLeap = 2024;
        if (yearLeap > 1584) {
            if ((yearLeap % 400 == 0) || (yearLeap % 4 == 0 && yearLeap % 100 != 0)) {
                System.out.println(yearLeap + " год является високосным ");
            } else {
                System.out.printf(yearLeap + " год не является високосным ");
            }
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            System.out.println("Доставка невозможна");
            return;
        }
        System.out.println("Потребуется дней " + deliveryTime);
        System.out.println("Задача 5");
        int monthNumber = 12;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Некорректный номер месяца");
            return;
        }
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
        }
    }
    }
