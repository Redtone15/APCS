package Cls08;

public class Array {
    public static void main(String[] args) {
        int[] a =getArray(10);
        print(a);
        System.out.println(findMin(a));
        System.out.println(countEven(a));
        zeroEven(a);
        print(a);
        swap(a,0,1);
        print(a);

    }
    public static void print(int[] arr){
         /*for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();*/
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static int[] getArray(int n){
        int[] arr = new int[n];

        for(int i=1;i<=n;i++){
            arr[i-1]=(int)(Math.random()*90+10);


        }
        return arr;




    }
    public static int countEven(int[] arr){
        int count = 0;
        for(int n:arr){
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
    public static void zeroEven(int[] arr){
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        int place = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                place = i;
            }
        }
        return place;
    }


}
