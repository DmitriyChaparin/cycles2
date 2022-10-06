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
        while (deposit < 12_000_000) {
            deposit = deposit + deposit / 100 * 7;
            month = month + 1;
            //System.out.println("Месяц " + month + " ,сумма накопления = " + deposit + " рублей.");

            //Задание 2

            if (month % 6 == 0)
                System.out.println("Месяц " + month + " ,сумма накопления = " + deposit + " рублей.");
        }
        System.out.println("");

        //Задание 3
        float deposit1 = 15000f;
        int month1 = 0;
        int accumulationPeriod = 9 * 12; // срок вклада
        while (deposit1 < 999999999) {
            deposit1 = deposit1 + deposit1 / 100 * 7;
            month1 = month1 + 1;
            if (month1 % 6 == 0 && month1 <= accumulationPeriod)
                System.out.println("Месяц " + month1 + " ,сумма накопления = " + deposit1 + " рублей.");
        }
        System.out.println("");

        //Задание 4
        int firstFriday = 3;
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + " -е число. Необходимо подготовить отчет.");
        }
        System.out.println("");

        //Домашнее задание 3
        //Задание 1
        int thisYears = 2022;
        int before = thisYears - 200;
        int after = thisYears + 100;
        for (int years = 0; years < 12000; years += 79) {
            if (years >= before && years <= after)
                System.out.println(years);
        }
        System.out.println("");

        //Задание 2
        int a = 2;
        int b = 1;
        int c = 0;
        for (; c < 20; b++) {
            c = a * b;
            System.out.println(a + "*" + b + "=" + c);
        }
        System.out.println("");

    }
}