package Cls02;

import java.util.*;

public class Pj1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Number");
        int number = s.nextInt();
        if(number <10){
            System.out.println("1");
        }else if(number <100)
        {
            System.out.println("2");
        }
        else if(number <1000)
        {
            System.out.println("3");
        }else if(number >1000)
        {
            System.out.println("Too big");
        }
    }
}
