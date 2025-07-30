package Hw04.McQ;

public class McQ09
{
    public static void main(String[] args)
    {
        isPrime(4);
        isPrime(9);
    }
    public static boolean isPrime(int num)
    {
        for (int i = 2; i < num/2; i++)
            if (num%i == 0)
                return false;
            else
                return true;

        return false;
    }
}
