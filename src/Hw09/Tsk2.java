package Hw09;

public class Tsk2 {
    public static void main(String[] args) {

    }
    public static void reverseArray(int[] a){
        int[] tmp = new int[a.length];
        for(int i=a.length-1;i>0;i--){
            tmp[i] = a[i];
        }
    }
    public static void reverseVertical(int[][] m, int c) {
        int t = 0;
        int b = m.length - 1;
        while (t < b) {
            int tmp = m[t][c];
            m[t][c] = m[b][c];
            m[b][c] = tmp;
            t++;
            b--;
        }
    }
    public static void reverseMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            reverseArray(m[i]);
        }
        int t = 0;
        int b = m.length - 1;
        while (t < b) {
            int[] tmp = m[t];
            m[t] = m[b];
            m[b] = tmp;
            t++;
            b--;
        }
    }
}

