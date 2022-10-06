public class Main {
    public static void main(String[] args) {
        //Exercise 1
        int limit=2459000, cashInMonth=15000, counter=0;
        double deposit=0, rateInMonth=1.01;
        while(deposit<limit) {
            deposit=(deposit+cashInMonth)*rateInMonth; // С учётом 12% годовых
            counter++;
        }
        System.out.format("Месяц "+counter+", сумма накоплений равна %.2f рублей \n",deposit);
        System.out.println();


        //Exercise 2
        int n=0;
        while (n<10) {
            n++;
            System.out.print(n+" ");
                    }
        System.out.println();
        for (;n>=1;n--) System.out.print(n+" ");
        System.out.println("\n");


        //Exercise 3
        int populationY=12_000_000, birthPer1000=17, mortalityPer1000=8;
        for (int c=1;c<=10;c++) {
            populationY+=(populationY*(birthPer1000-mortalityPer1000))/1000;
            System.out.println("Год "+c+", численность населения составляет "+populationY);
        }
        System.out.println();


        //Exercise 4
        int depositVLimit=12_000_000;
        double depositV=15000, depositVRate=1.07;
        for (int c=1;depositV<depositVLimit;c++) {
            depositV*=depositVRate;
            System.out.format("Месяц "+c+", сумма накоплений %.2f \n",depositV);
        }
        System.out.println();


        //Exercise 5
        depositV=15000;
        for (int c=1;depositV<depositVLimit;c++) {
            depositV*=depositVRate;
            if (c%6==0) System.out.format("Месяц "+c+", сумма накоплений %.2f \n",depositV);
        }
        System.out.println();


        //Exercise 6
        depositV=15000;
        for (int c=1, termInMonths=9;c<termInMonths*12;c++) {
            depositV *= depositVRate;
            if (c%6==0) System.out.format("Месяц "+c+", сумма накоплений %.2f \n",depositV);
        }
        System.out.println();


        //Exercise 7
        int fridayNumber=7, daysInMonth=31;
        for (int c=fridayNumber;c<=daysInMonth;c+=7) {
            System.out.println("Сегодня пятница, " + c + "-е число. Необходимо подготовить отчёт.");
        }
        System.out.println();


        //Exercise 8
        int step=79, recentYears=200, currentYear=2022, i=0;
        while (i<=currentYear) {
            if (i>=currentYear-recentYears) {
                System.out.println(i);
            }
            i+=step;
        }
        System.out.println(i);
        System.out.println();

    }
}