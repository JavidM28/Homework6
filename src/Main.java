public class Main {
    public static void main(String[] args)
    {
        //TASK 1
        for(int i = 1; i < 11; i++)
        {
            System.out.println(i);
        }

        //TASK 2
        for(int i = 10; i > 0; i--)
        {
            System.out.println(i);
        }

        //TASK 3
        for(int i = 2; i <= 17; i = i + 2)
        {
            System.out.println(i);
        }

        //TASK 4
        for(int i = 10; i >= -10; i--)
        {
            System.out.println(i);
        }

        //TASK 5
        for(int i = 1904; i <= 2096; i = i + 4)
        {
            System.out.println(i + " год является високосным.");
        }

        //TASK 6
        for (int i = 7; i <= 98; i = i + 7)
        {
            System.out.println(i);
        }

        //TASK 7
        for (int i = 1; i <= 512; i = i * 2)
        {
            System.out.println(i);
        }

        //TASK 8
        int totalMoney = 0;
        for (int i = 1; i <= 12; i++)
        {
            totalMoney += 29000;
            System.out.println("Месяц "+ i+ " сумма накоплений равна " + totalMoney + " рублей.");
        }

        //TASK 9
        double annualDeposit = 0;
        for (int i = 1; i <= 12; i++)
        {
            annualDeposit += 29000;
            annualDeposit = annualDeposit * 1.01;
            System.out.printf("Месяц %d сумма накоплений равна %.2f рублей. \n", i, annualDeposit);
        }

        //TASK 10
        int result = 0;
        for (int i = 1; i <= 10; i++)
        {
            result = 2 * i;
            System.out.println("2*" + i + "=" + result);
        }
    }
}