import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(" Иттерация цикла " + i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Иттерация цикла" + i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i += 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i *= 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int monthlySavings = 29000;
        int totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int month = 0; month < 12; month++) {
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
        System.out.println("Задача 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}