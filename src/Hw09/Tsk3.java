package Hw09;

public class Tsk3 {
    private int[][] entries;
    public int sumCross (int r, int c) {
        int sum = 0;

        for (int col = 0; col < entries [r].length; col++) {
            sum += entries [r][col];
        }

        for (int row = 0; row < entries.length; row++) {
            if (row != r) {
                sum += entries [row][c];
            }
        }
        return sum;
    }
}
