package Cls05;

public class Test
{
    public static void main(String[] args)
    {
        foo a = new foo();
        System.out.println(a.name+":"+a.age);
        a.name = "Jck";
        a.age = 20;
        System.out.println(a.name+":"+a.age);
        /*foo b = new foo("Hery",20);
        System.out.println(b.name+":"+b.age);*/
        a.name = "Tom";
        a.age = 20;
        System.out.println(a.name+":"+a.age);
    }

}
