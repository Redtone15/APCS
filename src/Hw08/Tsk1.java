package Hw08;

public class Tsk1 {
    private int[] arr1;
    public Tsk1(int n){
        arr1 = new int[n];
       for (int i =0; i<n; i++){
           arr1[i] = (int)(Math.random()*90+10);
       }
    }
    public String getArr(int[] arr){
        String tmp="";
        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        return tmp;

    }
    public int findMax(int[] arr){
        int max = arr[0];
        for (int a:arr){
            if(a>max){
                max = a;
            }
        }
        return max;

    }
    public int findSum(int[] arr){
        int sum = 0;
        for (int a:arr){
            sum+=a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Tsk1 tsk1 = new Tsk1(10);
        System.out.println(tsk1.getArr(tsk1.arr1));
        System.out.println(tsk1.findMax(tsk1.arr1));
        System.out.println(tsk1.findSum(tsk1.arr1));

    }
}
