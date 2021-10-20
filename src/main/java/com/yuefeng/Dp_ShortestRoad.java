package main.java.com.yuefeng;

// 杨辉三角最短路径
public class Dp_ShortestRoad {
    public static void main(String[] args) {
        int[][] roads = {{5},{7,8},{2,1,4},{4,9,1,1},{2,7,1,4,5}};
        Dp_ShortestRoad d = new Dp_ShortestRoad();
        System.out.println(d.shortestRoad(roads));
    }

    // int[][] roads = {{5},{7,8},{2,3,4},{4,9,6,1},{2,7,9,4,5}};
    // 满足公式：MinValue(roads[i][j]) = roads[i][j] + Math.min(roads[i-1][j-1], roads[i-1][j])
    public int shortestRoad(int[][] roads) {
        int minValue = Integer.MAX_VALUE;

        for (int i=0; i<roads.length; i++) {
            for (int j=0; j<roads[i].length; j++) {
                if (i==0) roads[i][j] = roads[i][j];
                else if (j==0) roads[i][j] = roads[i][j] + roads[i-1][j];
                else if (j==roads[i].length-1) roads[i][j] = roads[i][j] + roads[i-1][j-1];
                else roads[i][j] = roads[i][j] + Math.min(roads[i-1][j-1], roads[i-1][j]);
            }
        }

        for (int value : roads[roads.length-1]) {
            minValue = Math.min(minValue, value);
        }

        return minValue;
    }
}
