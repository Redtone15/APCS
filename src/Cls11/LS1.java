package Cls11;

public class LS1 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 4, 3, 5, 6};
        System.out.println(Search(arr, 8, 1));
        System.out.print(fibonacci(1));


    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int digitCount(int num) {
        return (int) Math.log(num);
    }

    public static int digitCoun2(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 10) {
            return 1;
        }
        return 1 + digitCount(num / 10);
    }

    public static int countA2(String str, int start) {
        int c = 0;
        if (start >= str.length()) {
            return 0;
        }
        if (str.substring(start).equals("A")) {
            return 1;
        } else {
            c = 0;
        }
        return c + countA2(str, start + 1);


    }

    public static int findMin(int[] arr, int start) {
        int c = 0;
        if (start >= arr.length - 1) {
            return start;
        }
        int rst = findMin(arr, start + 1);
        if (arr[start] < arr[start + 1]) {
            return start;
        } else {
            return rst;

        }
    }

    public static int Search(int[] arr, int key, int start) {
        if (start >= arr.length - 1) {
            return -1;
        }
        if (arr[start] == key) {
            return start;
        }
        return Search(arr, key, start + 1);
    }

    public static long fibonacci(int n) {
        if (n < 3) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

