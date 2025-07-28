package Hw04;

public class Tsk3_1 {


    public static void main(String[] args) {
        plotSine();
    }

    public static void plotSine() {
        for (double x = 0; x <= 10.6; x += 0.2) {
            int pos = (int) ((Math.sin(x) + 1) * 34.5);
            System.out.printf("%.1f |%s*%s%n", x, " ".repeat(pos), " ".repeat(69 - pos));
        }
    }

}
