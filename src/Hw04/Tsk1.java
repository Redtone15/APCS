package Hw04;

import java.util.Scanner;

public class Tsk1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));

    }
    public static boolean isPrime(int num){
        if(num <2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;

            }
        }return true;

    }
}
