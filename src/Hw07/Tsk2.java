package Hw07;

public class Tsk2 {
    private int first;
    private int second;

    public Tsk2(int first, int initialSecond) {
        this.second = initialSecond;
        this.first = first;
    }


    public String getProblem() {
        return first + " TIMES " + second;
    }

    public void nextProblem() {
        second++;
    }
}