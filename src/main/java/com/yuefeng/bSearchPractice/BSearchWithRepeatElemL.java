package main.java.com.yuefeng.bSearchPractice;

// 二分法查找，带重复的元素
// 1 3 4 5 6 8 8 8 11 18 中找到 值等于8且最靠前的索引位置，即索引5的位置
public class BSearchWithRepeatElemL {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    // 易错点，mid为：数组长度-1 的时候如果不加判断容易导致数组越界
    public static int find(int arr[], int value) {
        if (arr.length == 0) return -1;

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] < value) {
                l = mid + 1;
            } else if (arr[mid] > value) {
                h = mid - 1;
            } else {
                while (arr[mid] == value) {
                    if (mid == arr.length - 1) return mid;
                    mid++;
                }

                return mid - 1;
            }
        }

        return -1;
    }


    public static void test1() {
        int[] arr = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int value = 8;

        System.out.println("expect: 7, actual: " + find(arr, value));
    }

    public static void test2() {
        int[] arr = {1, 1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int value = 1;

        System.out.println("expect: 1, actual: " + find(arr, value));
    }

    public static void test3() {
        int[] arr = {1, 1};
        int value = 1;

        System.out.println("expect: 1, actual: " + find(arr, value));
    }

    public static void test4() {
        int[] arr = {1, 1};
        int value = 2;

        System.out.println("expect: -1, actual: " + find(arr, value));
    }

    public static void test5() {
        int[] arr = {1, 1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int value = 9;

        System.out.println("expect: -1, actual: " + find(arr, value));
    }
}
