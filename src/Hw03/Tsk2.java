package Hw03;

public class Tsk2
{
    public static void main(String[] args)
    {

        int num = 100;
        double ans = 0.0;
        for (int n = 0; n < num; n++)
        {

            double doubleFactorial2 = 1.0;
            for (int i = 2 * n; i > 0; i -= 2)
            {
                doubleFactorial2 *= i;
            }
            double doubleFactorial = 1.0;
            for (int i = 2 * n + 1; i > 0; i -= 2)
            {
                doubleFactorial *= i;
            }
            ans += doubleFactorial2 / doubleFactorial * Math.pow(0.5, n);
        }
        double pi = ans * 2;
        System.out.println(pi);

    }
}
