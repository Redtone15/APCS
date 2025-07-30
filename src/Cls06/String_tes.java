package Cls06;

public class String_tes {
    public static void main(String[] args) {
        String text = "Mary had a little lamb.";
        System.out.println(text);
        System.out.println(CountA(text));
        System.out.println(CountAB(text));
        System.out.println(reverseText(text));
    }

    public static int CountA(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals("a")) {
                count++;
            }
        }
        return count;
    }
    public static int CountAB(String text) {
        int count = 0;
        for (int i = 0; i < text.length()-1; i++) {
            if (text.substring(i,i+2).equals ("ab")) {
                count++;

            }
        }

        return count;
    }
    public static String reverseText(String text) {
        String reversed = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reversed += text.substring(i,i+1);

        }
        return reversed;
    }
}