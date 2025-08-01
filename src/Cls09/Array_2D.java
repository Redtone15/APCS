package Cls09;

import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        int[][]m =getMatrix(4,4);
        print_2(m);
        System.out.println(sum(m));
        System.out.println(rowSum(m));
        System.out.println(Arrays.toString(colSum(m)));
        System.out.println(Arrays.deepToString(transpose(m)));
        rotate(m);
        print_2(m);





    }
    public static void shift(int[] arr, int key){
        for(int l=0;l<arr.length-1;l++){
            arr[l]=arr[l+1];
        }
        arr[arr.length-1]=key;
    }
    public static void rotate(int[][] m){
        int temp=m[0][0];
        for(int i=0;i<m.length-1;i++){
            int k=m[i+1][0];
            shift(m[i],k);
        }
        shift(m[m.length-1],temp);
    }
    public static int[][] transpose(int[][] m) {
        int[][] res = new int[m[0].length][m.length];
        for(int row=0;row<m.length;row++){
            for(int collumn=0;collumn<m[0].length;collumn++){
                res[collumn][row]=m[row][collumn];
            }
        }
        return res;

    }
    public static int[] rowSum(int[][] matrix) {
        int[] sum = new int[matrix.length];
        for(int i = 0; i< matrix.length; i++){
            sum[i]=sum(matrix[i]);
        }
        return sum;
    }
    public static int[] colSum(int[][] mat)
    {
        int[] cSum = new int[mat[0].length];
        for (int c=0; c<mat[0].length; c++)
            for (int r=0; r<mat.length; r++)
                cSum[c] += mat[r][c];
        return cSum;
    }
    public static int sum(int[] arr){
        int sum =0;
        for(int n:arr){
            sum +=n;
        }
        return sum;
    }
    public static int sum(int[][] mat){
        int sum= 0;
        for(int[] row:mat){
            sum +=sum(row);

        }
        return sum;
    }
    public static int[] getArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 90+10);
        }
        return arr;
    }
    public static void print(int[] arr)
    {
        for (int n:arr){
            System.out.print(n + " ");
            }
        System.out.println();
    }
    public static void print_2(int[][] matrix){
        for (int[] row : matrix)
            print(row);
    }

    public static int[][] getMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random()*90 + 10);
            }
        }
        return matrix;
    }
    public static int[][] getMatrix2(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int r=0;r<rows;r++){
            matrix[r]=getArray(cols);
        }
        return matrix;
    }

}
