package Cls03;

public class Ex02
{
    public static void main(String[] args)
    {
        double sum = 0;
        double num = 1;

        for (int i=1; i<=100; i++)
        {
            sum += num/i;
            num = -num;
        }

        System.out.println(sum);
    }
}