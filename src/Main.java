public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int targetAmount = 2_459_000;
        int monthlyFee = 15_000;
        int currentSum = 0;
        int months = 0;
        while (currentSum < targetAmount) {
            months++;
            currentSum += monthlyFee;
            System.out.println(" Месяц " + months + ", сумма накоплений равна " + currentSum + " рублей");
        }

        System.out.println("Потребуется " + months + " месяца , чтобы накопить " + targetAmount + " рублей");

        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }


        System.out.println();

        for (int j = 10; j >= 1; j--) {

            System.out.print(j + " ");

        }

        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRatePerThousand = 17;
        int deathRatePerThousand = 8;
        int years = 10;

        for (int year = 1; year <= years; year++) {
            int births = (population * birthRatePerThousand) / 1000;
            int deaths = (population * deathRatePerThousand) / 1000;
            population = population + births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int currentAmount = 15000;
        double monthlyInterestRate = 0.07;
        targetAmount = 12_000_000;
        int monthCount = 0;

        while (currentAmount < targetAmount) {
            monthCount++;
            currentAmount += currentAmount * monthlyInterestRate;

            System.out.println("Через " + monthCount + " месяцев,сумма накоплений:" + currentAmount + " рублей");

        }
        System.out.println("Задача 5 ");
        currentAmount = 15000;
        targetAmount = 12_000_000;
        monthlyInterestRate = 0.07;
        monthCount = 0;

        while (currentAmount <= targetAmount) {
            monthCount++;
            currentAmount += currentAmount * monthlyInterestRate;

            if (monthCount % 6 == 0) {
                System.out.println("Через " + monthCount + " месяцев,сумма накоплений:" + currentAmount + " рублей");
            }
        }
        System.out.println("Задача 6");
        currentAmount = 15000;
        monthlyInterestRate = 0.07;
        int totalMonths = 9 * 12;

        for (int month = 1; month <= totalMonths; month++) {
            currentAmount += currentAmount * monthlyInterestRate;

            if (month % 6 == 0) {
                System.out.println("Через " + month + " месяцев,сумма накоплений:" + currentAmount + " рублей");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 6;
        int daysInMonth = 31;

        for (int fridayDay = firstFriday; fridayDay <= daysInMonth; fridayDay += 7) {
            System.out.println("Сегодня пятница, " + fridayDay + " -е число.Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        int cometPeriod = 79;

        int firstAppearance;
        if (startYear % cometPeriod == 0) {
            firstAppearance = startYear;
        } else {
            firstAppearance = startYear + (cometPeriod - (startYear % cometPeriod));
        }

        for (int year = firstAppearance; year <= endYear; year += cometPeriod) {
            if (year >= startYear && year <= currentYear) {
            }
            System.out.println(year); }

    }
}

