package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
public class Day20FZ_Count_MyPow {

    public static void main(String[] args) {
        Day20FZ_Count_MyPow d = new Day20FZ_Count_MyPow();
        System.out.println(d.myPow(1, -2147483648));

    }

    public int m(int y) {
        return y*10;
    }


    double mul = 1;
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        boolean pnb = n < 0;
        long pn = n;
        pn = Math.abs(pn);
        double value = x;
        while (pn != 1) {
            if (pn % 2 == 1) mul = mul * value;
            value = value * value;
            pn = pn / 2;
        }

        return pnb ? 1 / (value * mul) : (value * mul);
    }

}
