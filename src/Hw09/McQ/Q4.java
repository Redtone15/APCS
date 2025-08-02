package Hw09.McQ;

public class Q4 {
    public static void main(String[] args) {
        int[][] data = new int[5][10];
        for (int j = 0; j < data.length; j++)
        {
            for (int k = 0; k < data[0].length; k++)
            {
                if (j == k)
                {
                    System.out.println(data[j][k]);
                }
            }
        }
    }
}
