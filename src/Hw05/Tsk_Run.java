package Hw05;

public class Tsk_Run {
    public static void main(String[] args) {
        Tsk1 a = new Tsk1("Ethan","0408",3);
        System.out.println(a);
        a.getId();
        a.getName();
        a.getName();
        a.setPoints(123);
        System.out.println(a.toString());

    }
}
