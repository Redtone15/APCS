package Hw02;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Three nums");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int vs_1;
        int vs_2;
        if (n>m){
            System.out.println(n);
        }else if (m>x){
            System.out.println(m);
        }
        else{
            System.out.println(x);
        }

    }
}
