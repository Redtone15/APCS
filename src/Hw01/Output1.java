package Hw01;

import java.util.*;

public class Output1
{
    public static void main(String[] args)
    {
        //Input
        Scanner Int_ = new Scanner(System.in);
        System.out.println("Enter integer");
        int number_int = Int_.nextInt();
        Scanner Double_ = new Scanner(System.in);
        System.out.println("Enter double");
        double number_double = Double_.nextDouble();
        Scanner Boolean_ = new Scanner(System.in);
        System.out.println("Enter boolean");
        boolean number_boolean = Boolean_.nextBoolean();
        Scanner String_ = new Scanner(System.in);
        System.out.println("Enter string");
        String string = String_.nextLine();
        Scanner Line_ = new Scanner(System.in);
        System.out.println("Enter line");
        String line = Line_.nextLine();
        //Output
        System.out.println("The integer you have entered is: "+number_int);
        System.out.println("The double you have entered is: "+number_double);
        System.out.println("The boolean you have entered is: "+number_boolean);
        System.out.println("The string you have entered is: "+string);
        System.out.println("The line you have entered is: "+line);

    }
}
