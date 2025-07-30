package Cls05;

public class Bank_sim {
    private String name;
    private double balance;
    private double rate;
    public Bank_sim(){

    }

    public Bank_sim(String name1, double balance1, double rate1) {
        name = name1;
        balance = balance1;
        rate = rate1;
    }

    public String getName(){
        return name;
    }
    public Double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        balance = balance + amount;
        return amount;
    }
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;
    }
    public double addInterest(double amount){
        rate = rate + amount;
        return amount;
    }
    public double Transfer(double amount, Bank_sim other){
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }
    public String toString(){
        System.out.println("Name: "+name+"\nBalance: "+balance+"\nRate: "+rate);
        return "Name: "+name+"\nBalance: "+balance+"\nRate: "+rate;

    }
}
