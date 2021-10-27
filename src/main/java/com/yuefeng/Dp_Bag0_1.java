package main.java.com.yuefeng;

public class Dp_Bag0_1 {
    public static void main(String[] args) {
        int[] items = new int[5];
        items[0] = 2; items[1] = 2; items[2] = 4; items[3] = 5;
        items[4] = 6;

        int[] values = new int[5];
        values[0] = 3; values[1] = 4; values[2] = 8;
        values[3] = 9; values[4] = 6;



        Dp_Bag0_1 b = new Dp_Bag0_1();
        b.f(0, 0, items, 5, 9);
//        System.out.println(b.f01MaxItem(items, 9));
        System.out.println(b.f01MaxValue(items, 9, values));
    }

    public int maxW = Integer.MIN_VALUE; //存储背包中物品总重量的最大值
    // cw表示当前已经装进去的物品的重量和；i表示考察到哪个物品了；
    // w背包重量；items表示每个物品的重量；n表示物品个数
    // 假设背包可承受重量100，物品个数10，物品重量存储在数组a中，那可以这样调用函数：
    // f(0, 0, a, 10, 100)
    public void f(int i, int cw, int[] items, int n, int w) {
        if (cw == w || i == n) { // cw==w表示装满了;i==n表示已经考察完所有的物品
            if (cw > maxW) maxW = cw;
            return;
        }
        f(i+1, cw, items, n, w);
        if (cw + items[i] <= w) {// 已经超过可以背包承受的重量的时候，就不要再装了
            f(i+1,cw + items[i], items, n, w);
        }
    }

    // 0-1背包问题动态规划求解；重量不大于w的时候，最大重量能放多少；
    public int f01MaxItem(int[] items, int w) {
        boolean[] hasValues = new boolean[w+1];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j <hasValues.length; j++) {
                if (hasValues[j] && j + items[i] <= w) hasValues[j + items[i]] = true;
                if (!hasValues[items[i]]) hasValues[items[i]] = true;
            }
        }

        for (int i = w; i >= 0; i--) {
            if (hasValues[i]) return i;
        }

        return 0;
    }

    // 0-1背包问题动态规划最大价值; 满足最大重量不大于w的时候，能够放最大的价值是多少；
    public int f01MaxValue(int[] items, int w, int[] values) {
        int maxValue = 0;
        boolean[] hasValues = new boolean[w+1];
        int[] preValues = new int[w+1];

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j <hasValues.length; j++) {
                if (hasValues[j] && j + items[i] <= w) {
                    hasValues[j + items[i]] = true;
                    preValues[j + items[i]] = preValues[items[i]] + values[i];
                }

                if (!hasValues[items[i]]) hasValues[items[i]] = true;
                if (hasValues[items[i]]) {
                    preValues[items[i]] = Math.max(values[i], preValues[i]);
                }
            }
        }

        for (int i : preValues) {
            maxValue = Math.max(maxValue, i);
        }

        return maxValue;
    }
}
