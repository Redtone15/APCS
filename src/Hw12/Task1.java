package Hw12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        generateArr(a);
        InsertionSort(a);
        System.out.println(a);
        BinSearch(a,5);

    }
    public static ArrayList<Integer> generateArr(ArrayList<Integer> arr) {
        for(int  i=0;i<10;i++) {
            arr.add((int)(Math.random()*20));
        }
        return arr;
    }
    public static ArrayList<Integer> InsertionSort(ArrayList<Integer> arr) {
        for(int i=1;i<arr.size();i++) {
            int key = arr.get(i);
            int j = i-1;
            while(j>=0 && arr.get(j)>key) {
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, key);
        }
        return arr;
    }
    public static int BinSearch(ArrayList<Integer> arr, int key) {
        int low = 0;
        int high = arr.size()-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr.get(mid)==key) {
                return mid;
            }
            else if(arr.get(mid)>key) {
                high = mid-1;

            }
            else {
                low = mid+1;
            }

        }
        return -1;
    }
}