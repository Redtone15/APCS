package Cls03;

import java.util.Scanner;

public class Gold_coins
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("days ");
        int days = scanner.nextInt();
        scanner.close();

        int total = 0;
        int Stepping = 1;
        int daysUsed = 0;

        while (daysUsed < days)
        {
            int stepDays = Math.min(Stepping, days - daysUsed);
            total += Stepping * stepDays;
            daysUsed += stepDays;
            Stepping++;
        }

        System.out.println( total);
    }
}
