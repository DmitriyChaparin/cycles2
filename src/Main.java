public class Main {
    public static void main(String[] args) {

        //Домашнее задание 1
        //Задание 1
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i = i + 1;
        }
        System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");

        //Задание 2
        int o = 0;
        while (o < 10) {
            o = o + 1;
            System.out.print(" " + o);
        }
        System.out.println("\n");
        for (o = 10; o > 0; o--) {
            System.out.print(" " + o);
        }
        System.out.println("\n");

        //Задание 3
        int population = 12_000_000; // население
        int born = 17; // рождаемость в год но 1000 человек
        int dead = 8; // рождаемость на 1000 человек
        int populationGrowth = 0; // прирост населения
        int year = 0;
        while (year < 10) {
            populationGrowth = (population / 1000) * (born - dead);
            population = population + populationGrowth;
            year = year + 1;
            System.out.println("Год " + year + " числинность населения состовляет " + population);
        }
        System.out.println("");

        //Домашнее задание 2
        //Задание 1
        float deposit = 15000f;
        int month = 0;
        while ( deposit < 12_000_000 ){
            deposit = deposit + deposit / 100 * 7;
            month = month + 1;
            System.out.println("Месяц " + month + " ,сумма накопления = " + deposit + " рублей.");
        }


    }
}