package Cls07;

public class ComplexClass {
    private  double x;
    private  double y;
    private static int count =0;


    public ComplexClass() {

    }
    public ComplexClass(double x1, double y1) {
        x = x1;
        y = y1;
        count++;
    }
    public String toString() {
        return x + " + "+y+"i"+"    "+count;

    }
    public ComplexClass add(ComplexClass other){
        System.out.println(this);
        System.out.println(other);
        double x1 = this.x+other.x;
        double y1 = this.y+other.y;

        return new ComplexClass(x1, y1);

    }
    public static void reset() {
        count = 0;
    }
    public static ComplexClass add(ComplexClass a, ComplexClass b){
        double x=a.x+b.x;
        double y=a.y+b.y;
        return new ComplexClass(x,y);
    }
    public void add2(ComplexClass other){
        this.x += other.x;
        this.y += other.y;
    }
    public boolean equals(ComplexClass other){
        ComplexClass other1 = (ComplexClass) other;
        return this.x == other.x && this.y == other.y;
    }
    public static void main(String[] args) {

        ComplexClass c1 = new ComplexClass(1,2);
        ComplexClass c2 = new ComplexClass(3,4);

        System.out.println("c1=" +c1);
        System.out.println(c2);

        ComplexClass c3 = c2.add(c1);
        System.out.println("c3=" +c3);

        c1.add2(c2);

        ComplexClass c4 = c1.add(c1,c2);
        System.out.println("c4=" +c4);
        reset();
    }
}
