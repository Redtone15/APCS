package Hw09.McQ;

public class Q5 {
    public static void main(String[] args) {
        int[][] array2D = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        for (int[] i : array2D)
        {
            for (int x : i)
            {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    }
}
