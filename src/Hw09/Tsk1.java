package Hw09;

public class Tsk1 {
    public static void main(String[] args) {

    }
    public int[][] getMat(int m, int n) {
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int)(Math.random()*90+10);
            }
        }
        return mat;
    }
    public int sum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
    public int findMax(int[][] mat) {
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                max = Math.max(max, mat[i][j]);
            }
        }
        return max;
    }
    public int[][] addMat(int[][] mat1, int[][] mat2) {
        int[][] mat = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return mat;
    }
}
