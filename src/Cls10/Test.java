package Cls10;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList(10);
        print(list);
        System.out.println(list);
        insert(list, 16);
        print(list);
        swap(list,1,5);
        print(list);
        reverse(list);
        print(list);

    }
    public static ArrayList<Integer> getList(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int)(Math.random()*90+10));
        }
        return list;
    }
    public static void print(ArrayList<Integer> list){
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void removeEven(ArrayList<Integer> list) {
        for (int i = list.size()-1; i>=0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
    public static void insert(ArrayList<Integer> list, Integer key){
            int i=0;
            while (i<list.size()&&list.get(i)<key){
                i++;
            }
            list.add(i, key);
        }
        //二分
    public static void insert2(ArrayList<Integer> list, Integer key){
        int left =0;
        int right =list.size()-1;
        int position = list.size();
        while (left <= right) {
            int middle =(left + right)/2;
            if(list.get(middle)>key){
                position = middle;
                right = middle -1;
            }
            else {
                left = middle +1;
            }
        }
        list.add(position, key);
    }
    public static void swap(ArrayList<Integer> list, int i, int j){
        Collections.swap(list, i, j);
        Collections.swap(list, i, j);
        int tmp =list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
    public static void reverse(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int k=list.size()-1;k>=0;k--){
            temp.add(list.get(k));
        }
    }
    /*public static void reverse2(ArrayList<Integer> list){
        for(int i=list.size()/2;i++){
            swap(list,i,list.size()-i-1);

        }
    }*/
    public static void reverse3(ArrayList<Integer> list){
        for(int i = 0; i<list.size()/2;i++){
            list.add(0,list.remove(i));
        }
    }
}
//

