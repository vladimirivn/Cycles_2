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
    public static void task1 () {
        System.out.println("---------------------- Задача 1 ---------------------");
        int totalAccumulation = 0;
        int monthlySalary = 15_000;
        int count = 0;
        while (totalAccumulation <= 2_459_000){
            totalAccumulation += monthlySalary;
            count += 1;
            System.out.println("Месяц " + count +", сумма накоплений равна " + totalAccumulation + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("---------------------- Задача 2 ---------------------");
        int i = 0;
        while ( i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("---------------------- Задача 3 ---------------------");
        int year = 2022;
        int populationSize = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int i = 0;
        while (i < 10) {
            i++;
//            int populationGrowth = (birthRate - mortality)*populationSize/1000;
            populationSize += (birthRate - mortality) * populationSize/1000;
            System.out.println("Год "+(year + i) + ", численность населения составляет "+populationSize);
        }
    }
    public static void task4 () {
        System.out.println("---------------------- Задача 4 ---------------------");
        double deposit = 15000.00;   // Ежемесячный взнос
        int interestRate = 7; // Накопление суммы
        int i =0;
        while (deposit <= 12_000_000){
            deposit += deposit * interestRate / 100;
            String result = String.format("%.2f",deposit);
            i++;
            System.out.println("Месяц "+i+", сумма накоплений равна "+result+" рублей");
        }
    }
    public static void task5 () {
        System.out.println("---------------------- Задача 5 ---------------------");
        double deposit = 15000.00;   // Ежемесячный взнос
        int interestRate = 7; // Накопление суммы
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit += deposit * interestRate / 100;
            String result = String.format("%.2f", deposit);
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
            }
        }
    }
    public static void task6 () {
        System.out.println("---------------------- Задача 6 ---------------------");
        double deposit = 15000.00;   // Ежемесячный взнос
        int interestRate = 7; // Ежемесячный %
        int beginYears = 2022; // Год начала накопления
        int accumulationPeriod = 9;
        int endYears = beginYears + accumulationPeriod; // Год окончания накопления

        while (beginYears < endYears) {
            for (int month = 1; month <= 12; month++){
                deposit += deposit * interestRate / 100;
                String result = String.format("%.2f", deposit);
                if (month % 6 == 0) {
                    System.out.println("Год " + beginYears +", месяц " + month + ", сумма накопления равна " + result + " рублей");
                }
            }
            beginYears++;
        }
    }
    public static void task7 () {
        System.out.println("---------------------- Задача 7 ---------------------");
        int numberFriday = 2;
        int numberMonthDay = 31;
        while (numberFriday <= numberMonthDay ) {
            System.out.printf("Сегодня пятница, %d -е число. Необходимо подготовить отчет %n", numberFriday);
            numberFriday += 7;
        }
    }
    public static void task8 () {
        System.out.println("---------------------- Задача 8 ---------------------");

        int currentYear = 2022;
        int beforeCurrentYear200 = currentYear - 200;
        int afterCurrentYear100 = currentYear + 100;
        for (int year = beforeCurrentYear200; year <=afterCurrentYear100; year++) {
            if ( year % 79 ==0 ) {
                System.out.println(year);
            }
        }

    }
}