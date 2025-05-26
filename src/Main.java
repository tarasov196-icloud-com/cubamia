public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int agePersons = 18;
        if (agePersons >= 18) {
            System.out.println(" Если возраст человека равен " + agePersons + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + agePersons + " то он он не достиг совершеннолетия, нужно немного подождать ");
        }
        System.out.println("Задача 2");
        int outsideTemperature = 5;
        if (outsideTemperature < 5) {
            System.out.println(" На улице " + outsideTemperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + outsideTemperature + " градусов, можно идти без шапки ");
        }
        System.out.println(" Задача 3 ");
        int speedCar = 50;
        if (speedCar > 60) {
            System.out.println(" Если скорость " + speedCar + ", то придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость " + speedCar + ", то можно ездить спокойно ");
        }
        System.out.println(" Задача 4 ");
        agePersons = 19;
        if (agePersons >= 2 && agePersons <= 6) {
            System.out.println(" Если человеку " + agePersons + ", то ему нужно ходить в детский сад ");
        } else if (agePersons >= 7 && agePersons <= 17) {
            System.out.println(" Если человеку " + agePersons + ", то ему нужно ходить в школу ");
        } else if (agePersons >= 18 && agePersons <= 24) {
            System.out.println("Если человеку " + agePersons + ", то его место в университете ");
        } else {
            System.out.println("Если человеку " + agePersons + ", то ему пора ходить на работу ");
        }
        System.out.println(" Задача 5 ");
        agePersons = 5;
        if (agePersons < 5) {
            System.out.println("Если возраст ребенка равен " + agePersons + ", то ему нельзя кататься на аттракционе ");
        } else if (agePersons >= 5 && agePersons < 14) {
            System.out.println("Если возраст ребенка равен " + agePersons + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + agePersons + ", то он может кататься без сопровождения взрослого");
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