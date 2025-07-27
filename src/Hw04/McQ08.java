package Hw04;

public class McQ08
{
    public static void main(String[] args)
    {
        slope(1, 2, 5, 10);
    }
    public static void slope(int x1, int y1, int x2, int y2)
    {
        int xChange = x2 - x1;
        int yChange = y2 - y1;
        printFraction(yChange, xChange);
    }
    public static void printFraction(int numerator, int denominator)
    {
        System.out.print(numerator + "/" + denominator);
    }
}
