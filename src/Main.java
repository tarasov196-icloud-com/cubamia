import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println("Массив цифр: ");
        for (int num : intArray) {
            System.out.println(num + " ");
        }

        double[] doubleArray = {1.57, 7.654, 9.986};
        System.out.println("Массив дробных чисел: ");
        for (double num : doubleArray) {
            System.out.println(num + " ");
        }

        String[] months = {"Январь", "Февраль", "Март", "Апрель"};
        System.out.println("Массив произвольных строк: ");
        for (String month : months) {
            System.out.println(month + " ");
        }
        System.out.println("Задача 2");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for ( int i = 0; i < months.length; i++) {
            System.out.print(months[i]);
            if (i < months.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = months.length - 1;i>= 0; i --) {
            System.out.print(months[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        int[] intArrays = {1, 2, 3};
        for (int i = 0; i < intArrays.length; i++) {
            if (intArrays[i] % 2 != 0) {
                intArrays[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intArrays));
    }
}

