package Hw04;

public class Tsk2_2 {
    public static void main(String[] args) {
        double targetPi = 3.1415926535;
        int terms = 0;
        double approxPi;


        approxPi = 0.0;

        while (approxPi != targetPi) {
            terms++;
            approxPi = Pi(terms);
            approxPi = (long) (approxPi * 1e10) / 1e10;
        }

        System.out.println("Minimum terms needed: " + terms);
    }

    public static double Pi(int terms) {
        return Tsk2.Pi(terms);
    }
}