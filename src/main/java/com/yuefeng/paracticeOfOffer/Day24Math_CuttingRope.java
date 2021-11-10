package main.java.com.yuefeng.paracticeOfOffer;

public class Day24Math_CuttingRope {
    public static void main(String[] args) {
        Day24Math_CuttingRope d = new Day24Math_CuttingRope();
        d.cuttingRope(10);
    }

    public int cuttingRope(int n) {
        int maxValue = 0;
        int tmp = 0;
        for (int i=2; i<=n; i++) {
            if(n % i == 0) {
                tmp = (int) Math.pow(n/i, i);
            } else {
                tmp = 1;
                int len = n / i;
                int oc = n % i;
                int mulCount = i - oc;
                while(oc != 0) {
                    int len_oc = len+1;
                    tmp = tmp * len_oc;
                    oc--;
                }

                while(mulCount != 0) {
                    tmp = tmp * len;
                    mulCount--;
                }
            }

            if (tmp > maxValue) maxValue = tmp;
            else return maxValue;
        }

        return maxValue;
    }

}
