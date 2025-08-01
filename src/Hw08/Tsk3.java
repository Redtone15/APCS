package Hw08;

public class Tsk3 {

    public static void drawLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] counts = new int[7];


        for (int i = 0; i < 300; i++) {
            int a = (int)(Math.random() * 6 + 1);
            counts[a]++;
        }


        for (int i = 1; i <= 6; i++) {
            System.out.print(i + "|");
            drawLine(counts[i]);
        }
    }

}
