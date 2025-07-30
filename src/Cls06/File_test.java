package Cls06;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_test {
    public static void main(String[] args) throws IOException {
        PrintWriter fout = new PrintWriter("text.txt");
        fout.println("Hello World");
        fout.println("World");
        fout.close();


        File file = new File("text.txt");
        Scanner fin = new Scanner(file);
        while (fin.hasNextLine()) {
            System.out.println(fin.nextLine());

        }
        fin.close();

    }
}
