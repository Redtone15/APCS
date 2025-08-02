package Hw09.McQ;

public class Q3 {
    public static void main(String[] args) {
        int[][] arr = {{6, 2, 5, 7},
                {7, 6, 1, 2}};
        for (int j = 0; j < arr.length; j++)
        {
            for (int k = 0; k < arr[0].length; k++)
            {
                if (arr[j][k] > j + k)
                {
                    System.out.println("!");
                }
            }
        }
    }
}
