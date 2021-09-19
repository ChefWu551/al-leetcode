package main.java.com.yuefeng.bSearchPractice;

// 最后一个小于等于给定值得元素
// 3，5，6，8，9，10 给定 7 返回 6的位置
public class BSearchFirstLLORE {

    public static int find(int[] arr, int value) {

        int l = 0;
        int h = arr.length;

        while (l <= h) {
            int m = (l + h) / 2;

            if (arr[m] <= value) {
                if (m == arr.length - 1 || arr[m+1] > value) return m;
                l = m + 1;
            } else {
                h = m - 1;
            }

        }

        return -1;
    }
}
