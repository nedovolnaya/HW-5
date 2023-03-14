public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int amount = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + amount;
            month++;
            System.out.println("Month " + month + " total sum equal " + total + " rub");

        }
        System.out.println();

    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        int a = 10;
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        double population = 12_000_000;
        int birthPerYear = 17;
        int deathPerYear = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + population / 1000 * 17 - population / 1000 * 8;
            System.out.println("Год " + i + " ,численность населения составляет " + population);
        }
        System.out.println();
    }


    public static void task4() {
        System.out.println("Задача 4");
        double amount = 15000;
        int i = 1;
        while (amount < 12_000_000) {
            amount = amount + amount * 0.07;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + amount);
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double amount = 15000;
        int i = 1;
        while (amount < 12_000_000) {
            amount = amount + amount * 0.07;
            i++;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений равна " + amount);
        }
        System.out.println();

    }

    public static void task6() {
        System.out.println("Задача 6");
        double amount = 15000;
        for (int i = 6; i <= 9 * 12; i = i + 6) {
            amount += amount * 0.07 * 6;
            System.out.println("Период " + i + " месяцев, сумма накоплений равна " + amount);
            System.out.println();

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int friday = 3; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int last200Year = 2023 - 200;
        int future100Year = 2023 + 100;
        for (int cometYear = 0; cometYear <= future100Year; cometYear = cometYear + 79) {
            if (cometYear >= last200Year && cometYear <= future100Year)
                System.out.println(cometYear);
        }

    }
}


