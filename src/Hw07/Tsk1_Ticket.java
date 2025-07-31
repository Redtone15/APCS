package Hw07;

public class Tsk1_Ticket {
    private int serialNumber;
    private double price;
    private static int currentNumber = 10000;
    //Constructor
    public Tsk1_Ticket(double price1){
        this.price = price1;
        currentNumber++;
        serialNumber = currentNumber;

    }

    public String toString(){
        return "Num"+serialNumber + " \nPrice: " + price;
    }
    //Compare
    public boolean equals(Object other){
        return this.price==((Tsk1_Ticket)other).price;
    }

}
