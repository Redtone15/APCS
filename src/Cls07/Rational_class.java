package Cls07;

public class Rational_class {
    private int myNum;
    private int myDenom;
    public Rational_class(){
        myNum = 0;
        myDenom = 1;

    }
    public Rational_class(int n){
        myNum = n;
    }
    public Rational_class(int numer, int denom){
        myNum = numer;
        myDenom = denom;
        fixSigns();
    }
    public Rational_class plus(Rational_class r){
        myNum = this.myNum *r.myDenom + this.myDenom * r.myNum;
        myDenom = this.myDenom * r.myDenom;
        return new Rational_class(myNum, myDenom);
    }
    public int gcd(int m,int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        while (n != 0) {
            int tmp = m % n;
            m = n;
            n = tmp;
        }
    return m;
    }
    public void reduce(){
        int gcd =gcd(myNum, myDenom);
    }
    public String toString(){
        return myNum + "/" + myDenom;
    }
    public void fixSigns(){
        if(myDenom<0){
            myNum= - myNum;
            myDenom= -myDenom;
        }
    }
    public boolean equals(Object r){
        Rational_class r1 = (Rational_class) r;
        return this.myNum == r1.myNum && this.myDenom == r1.myDenom;
    }
    public static void main(String[] args){
        Rational_class r = new Rational_class(2,3);
        Rational_class r2 = new Rational_class(1,-6);
        Rational_class r3 =r.plus(r2);
        System.out.println("r1:"+r);

        System.out.println("r2:"+r2);
        System.out.println("r3:"+r3);


    }

}
