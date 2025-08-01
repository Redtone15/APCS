package Hw08;

public class Tsk2 {
    private int[] scores;
    //avg
    private double average(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return (double) sum / (last - first + 1);
    }
    private boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public double finalAverage() {
        if (hasImproved()) {
            int startIndex = scores.length / 2;
            return average(startIndex, scores.length - 1);
        } else {
            return average(0, scores.length - 1);
        }
    }
}
