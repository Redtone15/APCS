package Cls06;

public class Text_tt {
    public static void main(String[] args) {

        /*String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        String str ="hello";
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.substring(i,i+1));*/
        String text ="Mary had a little lamb.";
        System.out.println(text);
        System.out.println(CountA(text));

    }

    public static int CountA(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A') {
                count++;

            }

        }
        return count;
    }
}

