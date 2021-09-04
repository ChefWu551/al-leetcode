package main.java.com.yuefeng.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] values = new int[]{6, 11, 3, 9, 8};
        System.out.println(Arrays.toString(QuickSort.sort(values, 0, values.length - 1)));
    }

    public static int[] sort(int[] values, int p, int q) {
        if (p >= q) return values;
        int pivot = values[q];
        int i = p;
        // https://time.geekbang.org/column/article/41913
        // 关键步骤，声明两个指针，一个指针用于遍历当前数组范围内指定的元素，把和基准值以上和基准值以下的分成两个数组
        for (int j = p; j < q; j++) {
            if (values[j] < pivot) {
                swap(values, i, j);
                i++;
            }
        }

        // 关键！基准值左边的和基准值右边的以基准值进行分开，此时基准值所在的索引为i
        swap(values, i, q);

        sort(values, p, i-1);
        sort(values, i+1, q);
        return values;
    }

    public static int[] swap(int[] values, int p, int q) {
        int swapValue = values[p];
        values[p] = values[q];
        values[q] = swapValue;

        return values;
    }
}
