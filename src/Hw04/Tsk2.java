package Hw04;

public class Tsk2
{
    public static void main(String[] args)
    {
        System.out.println(Pi(120));

    }
    public static double doubleFactorial(int n)
    {
        double ans = 1.0;
        for(int i =n; i>0; i-=2)
        {
            ans *= i;
        }
        return ans;
    }
    public static double Pi(int terms)
    {
        double ans = 0.0;
        for(int n =0;n<terms;n++)
        {
            double even=doubleFactorial(2*n);
            double odd=doubleFactorial(2*n+1);
            ans += even/odd*Math.pow(0.5,n);
        }
        return ans*2;
    }

}
