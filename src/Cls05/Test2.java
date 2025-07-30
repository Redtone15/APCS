package Cls05;

public class Test2
{

    public static void main(String[] args)
    {
        foo2 a = new foo2();
        System.out.println(a);
        foo2 b = new foo2("Tom",20);
        System.out.println(b);

        a.setName("Tom");
        a.setAge(20);
        System.out.println(a);
        System.out.println(b);
    }
}
