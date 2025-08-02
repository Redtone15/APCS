package Hw09.McQ;

public class Q2 {
    public static void main(String[] args) {
        int dim=4;

        int[][]mat = {{1,1,2,2},{1,2,2,4},{1,3,2,6},{1,4,2,8}};
        System.out.println(sum(mat));
    }
    public static int sum(int[][]mat) {
        int sum=0;
        for(int row =0;row<4;row++){
            sum = sum+mat[row][3];
        }
        return sum;
    }
}
