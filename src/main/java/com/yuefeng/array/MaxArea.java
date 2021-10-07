package main.java.com.yuefeng.array;

public class MaxArea {

    public static void main(String[] args) {
        MaxArea m = new MaxArea();
        int[] values = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(m.maxAreaDoublePointer(values));
    }

    // 暴力求解
    public int maxArea(int[] height) {
        int r = 0;

        int length = height.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j<length; j++) {
                r = Math.max(r, (j - i) * Math.min(height[i], height[j]));
            }
        }

        return r;
    }

    // 双指针,问题求解
    public int maxAreaDoublePointer(int[] height) {
        int maxArea = 0;

        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(maxArea, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

}
