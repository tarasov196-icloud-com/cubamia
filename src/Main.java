public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] weeklyExpenses = {14000, 15000, 20000, 22000, 11000};
        int totalExpenses = 0;
        for (int expense : weeklyExpenses) {
            totalExpenses += expense;

        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");


        System.out.println("Задача 2");
        int[] weeklyExpense = {25000, 13900, 7000, 5000, 19000};
        int minExpense = weeklyExpense[0];
        int maxExpense = weeklyExpense[0];
        for (int expense : weeklyExpense) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей");


        System.out.println("Задача 3");
        int[] weekExpenses = {35000, 17542, 15239, 8000, 23000};
        totalExpenses = 0;
        for (int expense : weekExpenses) {
            totalExpenses += expense;
        }
        double averageExpense = (double) totalExpenses / weekExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(reverseFullName);
    }
}
