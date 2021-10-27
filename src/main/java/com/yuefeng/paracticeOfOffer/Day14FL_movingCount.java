package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
public class Day14FL_movingCount {

    public int movingCount(int m, int n, int k) {
        int count = 0;
        for (int i =0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int sum = 0;
                int tmpI = i;
                int tmpJ = j;
                do {
                    sum = sum + tmpI % 10;
                    tmpI = tmpI /10;
                } while(tmpI != 0);

                do {
                    sum = sum + tmpJ % 10;
                    tmpJ = tmpJ /10;
                }while(tmpJ != 0);

                if (sum <= k) {
                    count++;
                }
            }
        }

        return count;
    }

}
