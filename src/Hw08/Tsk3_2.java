package Hw08;

public class Tsk3_2 {
    private static final int AVG_COUNT = 100;
    public int[] counts;
    public int[] Reg;
    private static final double[] RANGE_ARRAY = {
            2.0, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9,
            3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9,
            4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 4.6, 4.7, 4.8, 4.9, 5.0
    };

    public Tsk3_2(int[] counts, int[] Reg) {
        this.counts = counts;
        this.Reg = Reg;
        for (int i = 0; i < Reg.length; i++) {
            Reg[i] = 0;
        }
    }


    public void Roll() {
        for (int i = 0; i < AVG_COUNT; i++) {
            counts[i] = (int) (Math.random() * 6 + 1);
        }
    }

    public int write(int[] counts) {
        int sum = 0;
        for (int n : counts) {
            sum += n;
        }
        return sum;
    }

    public double finalAverage(int[] counts) {
        double sum = write(counts);
        double avg = sum / AVG_COUNT;
        return (double) Math.round(avg * 10) / 10;
    }

    public int list_add(double avg) {
        for (int i = 0; i < RANGE_ARRAY.length; i++) {
            if (RANGE_ARRAY[i] == avg) {
                return i;
            }
        }
        return -1;
    }

    public void findLoc(int[] arr, int loc) {
        if (loc >= 0 && loc < arr.length) {
            arr[loc]++;
        }
    }

    public void drawLine(int L) {
        for (int i = 0; i < L; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public void drawHistogram() {
        for (int i = 0; i < RANGE_ARRAY.length; i++) {
            System.out.print(RANGE_ARRAY[i] + "|");
            drawLine(Reg[i]);
        }
    }

    public static void main(String[] args) {
        int[] counts = new int[AVG_COUNT];
        int[] reg = new int[RANGE_ARRAY.length];
        Tsk3_2 t = new Tsk3_2(counts, reg);

        for (int i = 0; i < 11000; i++) {
            t.Roll();
            double avg = t.finalAverage(counts);
            System.out.printf("AVG: %.1f%n", avg);
            int loc = t.list_add(avg);
            t.findLoc(reg, loc);
            System.out.println("Location" + loc + "Counter " + reg[loc]);

        }
        t.drawHistogram();
    }
}
    