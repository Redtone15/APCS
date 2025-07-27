package Hw04;

public class McQ10 {
    public static void add1(int m)
    {
        int q = m+1;
        m = m + 1;
    }
    public static void main(String[] args)
    {
        int m = 10;
        int q = m;
        add1(m);
        System.out.println(q + " " + m);
    }
}
