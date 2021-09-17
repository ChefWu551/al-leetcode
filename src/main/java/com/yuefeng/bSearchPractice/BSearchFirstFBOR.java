package main.java.com.yuefeng.bSearchPractice;

// 第一个大于等于给定元素的值
// 3，5，6，8，9，10 给定 7 返回 8的位置
public class BSearchFirstFBOR {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    public static int find(int[] arr, int value) {

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < value) {
                l = m + 1;
            } else if (arr[m] >= value) {
                if (m == 0 || arr[m - 1] <value) return m;
                h = m - 1;
            }
        }

        return -1;
    }

    public static void test1() {
        int[] arr = {3, 5,6,8,9,10};
        int value = 7;

        System.out.println("expect: 3, actual: " + find(arr, value));
    }

    public static void test2() {
        int[] arr = {3, 5,6,8,9,10};
        int value = 6;

        System.out.println("expect: 2, actual: " + find(arr, value));
    }

    public static void test3() {
        int[] arr = {3, 5, 6, 6, 6, 6, 8,9,10};
        int value = 7;

        System.out.println("expect: 6, actual: " + find(arr, value));
    }

    public static void test4() {
        int[] arr = {5, 6, 6, 6, 6, 8,9,10};
        int value = 5;

        System.out.println("expect: 0, actual: " + find(arr, value));
    }

    public static void test5() {
        int[] arr = {5};
        int value = 4;

        System.out.println("expect: 0, actual: " + find(arr, value));
    }

    public static void test6() {
        int[] arr = {5};
        int value = 6;

        System.out.println("expect: -1, actual: " + find(arr, value));
    }

}
