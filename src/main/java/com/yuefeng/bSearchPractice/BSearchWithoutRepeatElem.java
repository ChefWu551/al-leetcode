package main.java.com.yuefeng.bSearchPractice;

// 二分法查找，不带重复的元素
// 1 3 4 5 6 8 11 18 中找到 值等于8且最靠前的索引位置，即索引5的位置
public class BSearchWithoutRepeatElem {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    // 易错点：边界情况
    // 起始点位置 h 注意！
    public static int find(int[] arr, int value) {
        if (arr.length == 0) return -1;

        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < value) {
                l = m + 1;
            } else if (arr[m] > value){
                h = m - 1;
            } else {
                return m;
            }
        }

        return -1;
    }

    public static void test1() {
        int[] arr = {0};
        int value = 0;

        System.out.println("expect: 0, actual: " + find(arr, value));
    }

    public static void test2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int value = 5;

        System.out.println("expect: 4, actual: " + find(arr, value));
    }

    public static void test3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int value = 8;

        System.out.println("expect: -1, actual: " + find(arr, value));
    }

    public static void test4() {
        int[] arr = {1, 2};
        int value = 2;

        System.out.println("expect: 1, actual: " + find(arr, value));
    }

}
