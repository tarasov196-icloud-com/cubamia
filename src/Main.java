public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 18;
        if (year >= 18) {
            System.out.println(" Если возраст человека равен " + year + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + year + " то он он не достиг совершеннолетия, нужно немного подождать ");
        }
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temperature + " градусов, можно идти без шапки ");
        }
        System.out.println(" Задача 3 ");
        int speed = 50;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + ", то придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость " + speed + ", то можно ездить спокойно ");
        }
        System.out.println(" Задача 4 ");
        int age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println(" Если человеку " + age + ", то ему нужно ходить в детский сад ");
        } else if (age >= 7 && age <= 17) {
            System.out.println(" Если человеку " + age + ", то ему нужно ходить в школу ");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + ", то его место в университете ");
        } else {
            System.out.println("Если человеку " + age + ", то ему пора ходить на работу ");
        }
        System.out.println(" Задача 5 ");
        age = 5;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе ");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }
        System.out.println(" Задача 6 ");
        int capacityСarriage = 102;
        int seatsPlaces = 60;
        int passengers = 23;
        if (passengers <= seatsPlaces) {
            System.out.println("Если в вагоне " + passengers + " пассажира, то в вагоне есть сидячие места ");
        } else if (passengers > seatsPlaces && passengers <= capacityСarriage) {
            System.out.println("Если в вагоне " + passengers + " пассажира, то в вагоне есть стоячие места ");

        } else {
            System.out.println("В вагоне нет мест");
        }
        System.out.println(" Задача 7 ");
        int one = 85;
        int two = 63;
        int three = 105;
        if (one > two && one > three) {
            System.out.println("Значение " + one + " максимальное");
        } else if (two > one && two > three) {
            System.out.println("Значение " + two + " максимальное");
        } else {
            System.out.println("Значение " + three + " максимальное");
        }
    }


}