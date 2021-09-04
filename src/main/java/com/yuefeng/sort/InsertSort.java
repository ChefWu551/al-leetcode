package main.java.com.yuefeng.sort;

import java.util.Arrays;

// 插入排序法
public class InsertSort {

    public static void main(String[] args) {
        int[] values = new int[]{6, 5, 4, 2, 1, 7, 10};
        System.out.println(Arrays.toString(InsertSort.sort(values)));
    }

    public static int[] sort(int[] values) {
        if (values.length <= 1) return values;

        for (int i=1; i<values.length; i++) {
            int value = values[i];
            int j = i -1;
            for (; j >=0; j--) {
                if (value < values[j]) {
                    values[j+1] = values[j]; // 基于原有数据进行移动，比起冒泡用了临时赋值又是一种优化
                } else {
                    // 这句话很重要，因为性能比冒泡法高很多的关键步骤，因为比较的步骤变少了
                    break;
                }
            }

            values[j+1] = value;
        }

        return values;
    }
}
