package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
public class Day09dp_MaxValue {

    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0][0] = 1; grid[0][1] = 3; grid[0][2] = 1;
        grid[1][0] = 1; grid[1][1] = 5; grid[1][2] = 1;
        grid[2][0] = 4; grid[2][1] = 2; grid[2][2] = 1;
        Day09dp_MaxValue d = new Day09dp_MaxValue();
        System.out.println(d.maxValue(grid));
    }

    public int maxValue(int[][] grid) {
        int max = 0;
        int xLength = grid.length;
        int yLength = grid[0].length;
        for (int i =0; i< xLength; i++) {
            for(int j=0; j< yLength; j++) {
                if (j == 0 && i == 0) continue;
                if(i == 0) {
                    grid[i][j] += grid[i][j-1];
                } else if(j == 0) {
                    grid[i][j] += grid[i-1][j];
                }else {
                    grid[i][j] += Math.max(grid[i][j-1] , grid[i-1][j]);
                }
            }
        }

        return grid[xLength - 1][yLength - 1];
    }
}
