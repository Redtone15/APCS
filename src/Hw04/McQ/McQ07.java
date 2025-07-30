package Hw04.McQ;

public class McQ07
{
    public static void main(String[] args)
    {
        System.out.println(mystery(23,10));
    }
    public static int mystery(int a, int b)
    {
        int d = 0;
        for(int c = a; c > b; c--)
            d = d + c;
        return d;
    }
}
