package Cls05;

public class foo2
{
    private String name;
    private int age;
    public foo2()
    {
        name = "Jck";
        age = 20;
    }
    public foo2(String name1, int age1)
    {
        name = name1;
        age = age1;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        //return name+":"+age;
        return "hello";
    }
}
