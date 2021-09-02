package main.java.com.yuefeng.sort;

import java.util.Arrays;

// 冒泡排序法
public class BubblingSort {


    public static void main(String[] args) {
        int[] values = new int[]{6, 5, 4, 2};

        System.out.println(Arrays.toString(BubblingSort.sort(values)));
    }

    public static int[] sort(int[] values) {
        for (int i=0; i<values.length; i++) {
            for (int j=i+1; j<values.length; j++) {
                if (values[i] > values[j]) {
                    int temp = values[j];
                    values[j] = values[i];
                    values[i] = temp;
                }
            }
        }

        return values;
    }

    // todo: 优化方案，如果没有元素交换则此时可以直接弹出无需继续比较
}
