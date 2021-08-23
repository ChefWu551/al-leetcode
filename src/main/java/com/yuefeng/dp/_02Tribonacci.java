package main.java.com.yuefeng.dp;

public class _02Tribonacci {

    public static void main(String[] args) {
        System.out.println(tribonacci1(6));
    }

    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n < 2) return 2;

        int r = 1;
        int q = 0;
        int p = 0;
        int j = 1;

        for (int i = 3; i <= n; i++) {
            q = p;
            p = j;
            j = r;
            r = p + q + j;
        }

        return r;
    }

    public static int tribonacci1(int n) {
        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return 1;
        }
        int p = 0, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; ++i) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }


}
