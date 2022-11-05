public class Main {
    public static void main(String[] args) {

        //Домашнее задание - 1
        System.out.println("Домашнее задание - 1");

        //Задание 1
        System.out.println("Задание 1");
        int deposit0 = 15_000;
        int total0 = 0;
        int months = 0;
        while (total0 <= 2_459_000) {
            total0 = total0 + total0 / 100;
            total0 = total0 + deposit0;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + total0 + " рублей");
        }

        //Задание 2
        System.out.println("Задание 2");
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(+y + " ");
        }
        System.out.println("");

        for (int i = 10; i >= 1; i--) {
            System.out.print(+i + " ");
        }
        System.out.println("");

        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRatePerThousand = 17;
        int mortalityRatePerThousand = 8;
        int birthPerYear;
        int mortalityPerYear;
        int year = 0;
        while (year <= 10) {
            birthPerYear = (birthRatePerThousand * population) / 1_000;
            mortalityPerYear = (mortalityRatePerThousand * population) / 1_000;
            population = population + birthPerYear - mortalityPerYear;
            year++;
            System.out.println("Год " + year + ", Численность населения составляет " + population);
        }

        //Домашнее задание - 2
        System.out.println("Домашнее задание - 2");

        //Задание 1
        System.out.println("Задание 1");
        int deposit = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            total = total + (total * 7) / 100;
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей");
        }

        //Задание 2
        System.out.println("Задание 2");
        int deposit1 = 15_000;
        int total1 = 0;
        int months1 = 0;
        while (total1 <= 12_000_000) {
            total1 = total1 + (total1 * 7) / 100;
            total1 = total1 + deposit1;
            months1++;
            if (months1 % 6 == 0) {
                System.out.println("Месяц " + months1 + ", сумма накоплений " + total1 + " рублей");
            }
        }

        //Задание 3
        System.out.println("Задание 3");
        int deposit2 = 15_000;
        int total2 = 0;
        int months2 = 0;
        for (int i = 1; i <= 9 * 12; i++) {
            total2 = total2 + (total2 * 7) / 100;
            total2 = total2 + deposit2;
            months2++;
            if (months2 % 6 == 0) {
                System.out.println("Месяц " + months2 + ", сумма накоплений " + total2 + " рублей");
            }
        }

        //Задание 4
        System.out.println("Задача 4");
        int fridayNumber = 7;
        while (fridayNumber < 31) {
            System.out.println("Сегодня пятница, " + fridayNumber + "-е число. Необходимо подготовить отчет.");
            fridayNumber += 7;
        }

        //Домашнее задание 3
        System.out.println("Домашнее задание - 3");

        //Задание 1
        System.out.println("Задание 1");
        int year1 = 0;
        int currentYear = 2022;
        int startPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        for (; year1 <= endPeriod; year1 += 79) {
            if (year1 > startPeriod) {
                System.out.println(year1);
            }
        }

            //Задание 2
            System.out.println("Задание 2");
            int multiplier = 1;
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("2 * " + (multiplier++) + " = " + i);
                }

            }

        }
    }
