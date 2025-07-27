package Hw02;

import java.util.Scanner;

public class Tsk1
{
    public static void main(String[] args){
        int c;
        int d;
        c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        d=b;
        b = b/60;
        c=(d-b*60)%60;
        a = a+b;
        System.out.println(a);
        System.out.println(c);



    }
}
