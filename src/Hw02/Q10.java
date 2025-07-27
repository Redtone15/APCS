package Hw02;

public class Q10 {
    public static void main(String[] args) {
        int x = 30, y = 40;
        if (x >= 0)
        {
            if (x <= 100)
            {
                y = x * 3;
                if (y < 50)
                    x /= 10;
            }
            else
                y = x * 2;
        }
        else
            y = -x;
        System.out.println(y);
        System.out.println(x);
    }
}
