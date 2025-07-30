package Cls05;

public class Bank_run {
    public static void main(String[] args) {
        Bank_sim a = new Bank_sim("Tom",123.3,0.3);
        Bank_sim b = new Bank_sim("Li",22,0.1);
        a.addInterest(0.3);
        b.deposit(35.3);


    }
}
