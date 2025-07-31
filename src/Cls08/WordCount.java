package Cls08;
import java.util.*;

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        //for(String s :args){
        //    System.out.println(s);
        File f= new File("Trump.txt");
        Scanner s = new Scanner(f);
        String text =s.next();
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words.length);
        s.close();


    }
}
