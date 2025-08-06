package Cls12;


public class Insertion {
    public static void main(String[] args) {

    }
    public static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j = i;
            while(j>0 &&arr[j-1]>key) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }
    public static int binSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]==key) {
                return mid;
            }
            else if(arr[mid]<key) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static int reursiveBinarySearch(int[] arr, int key,int low,int high) {
        int mid = (low+high)/2;
        if(low>high) {
            return -1;
        }
        if(arr[mid]==key) {
            return mid;
        }
        else if(arr[mid]<key) {
            return reursiveBinarySearch(arr,key,low,mid-1);
        }
        else {
            return reursiveBinarySearch(arr,key,mid+1,high);
        }

    }
}
