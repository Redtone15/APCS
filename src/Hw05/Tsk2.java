package Hw05;

public class Tsk2 {
    public class APLine {
        private int a;
        private int b;
        private int c;

        public APLine(int aParam, int bParam, int cParam) {
            a = aParam;
            b = bParam;
            c = cParam;
        }

        public double getSlope() {
            return -((double) a / b);
        }

        public boolean isOnLine(int x, int y) {
            return (a * x + b * y + c) == 0;
        }
    }
}
