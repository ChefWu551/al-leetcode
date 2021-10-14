package main.java.com.yuefeng.paracticeOfOffer;

//https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
public class Day05FindNumberIn2DArray {

    public static void main(String[] args) {
        int[][] matrix = new int[2][5];
        matrix[0][0] = 1;
        matrix[0][1] = 4;
        matrix[0][2] = 7;
        matrix[0][3] = 9;
        matrix[0][4] = 10;

        matrix[1][0] = 2;
        matrix[1][1] = 5;
        matrix[1][2] = 8;
        matrix[1][3] = 9;
        matrix[1][4] = 10;

        Day05FindNumberIn2DArray d = new Day05FindNumberIn2DArray();
        System.out.println(d.findNumberIn2DArray(matrix, 5));
    }


    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 要点1：排除空数组，否则将导致下面判断数组越界
        if(matrix.length == 0 || matrix[0].length == 0) return false;

        for(int[] values : matrix) {
            int l = 0;
            // 要点2：索引是从长度减一以后开始的，否则数组越界
            int r = values.length - 1;
            while (true) {
                if(values[(l + r) / 2] == target) {
                    return true;
                } else if(values[(l + r) / 2] > target) {
                    // 要点3：如果当前元素不等于查找的值且大于要查找的值，则取中间点的左边的下一个点
                    r = (r + l) / 2 - 1;
                } else {
                    // 要点4：如果当前元素不等于查找的值且小于要查找的值，则取中间点的右边的下一个点
                    l = (r + l) /2 + 1;
                }

                if(l > r) break;
            }
        }

        return false;
    }

}
