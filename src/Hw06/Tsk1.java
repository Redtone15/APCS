package Hw06;

public class Tsk1 {
    public static void main(String[] args) {

    }
    public static int countSub(String text, String sub) {
        int count = 0;
        int subLength = sub.length();
        int maxIndex = text.length() - subLength;

        for (int i = 0; i <= maxIndex; i++) {
            if (text.substring(i, i + subLength).equalsIgnoreCase(sub)) {
                count++;
            }
        }

        return count;
    }
}
