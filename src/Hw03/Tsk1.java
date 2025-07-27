package Hw03;

public class Tsk1
{
    public static void main(String[] args)
    {
        int terms = 20;
        double e = 0.0;

        for (int i = 1; i <= terms; i++)
        {
            int factorial = 1;
            for (int j = 1; j < i; j++)
            {
                factorial *= j;
            }
            e += 1.0 / factorial;
        }

        System.out.println(e);

    }
}
