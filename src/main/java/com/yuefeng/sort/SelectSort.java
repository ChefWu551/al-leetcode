package main.java.com.yuefeng.sort;

import java.util.Arrays;

// 选择排序法
// 原地排序算法，但是不是稳定排序
public class SelectSort {

    public static void main(String[] args) {
        int[] values = new int[]{6, 5, 4, 2, 1, 7, 10};
        System.out.println(Arrays.toString(SelectSort.sort(values)));
    }

    public static int[] sort(int[] values) {
        if (values.length <=0 ) return values;

        for (int i=0; i<values.length; i++) {
            int minValue = values[i];
            int swapIndex = i;
            for (int j=i+1; j<values.length; j++) {
                if (minValue > values[j]) {
                    minValue = values[j];
                    swapIndex = j;
                }
            }

            if (swapIndex != i) {
                int tempValue = values[i];
                values[i] = minValue;
                values[swapIndex] = tempValue;
            }
        }

        return values;
    }


}
