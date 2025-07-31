package Hw07;

public class Tsk1_Ticket_Run {
    public static void main(String[] args) {
        Tsk1_Ticket t1 = new Tsk1_Ticket(5.33443344);
        Tsk1_Ticket t2 = new Tsk1_Ticket(5.33443344);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.equals(t2));
    }

}
