package main.java.com.yuefeng.paracticeOfOffer;

//https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
public class Day05MinArray {
    public int minArray(int[] numbers) {
        if(numbers.length == 0) return -1;
        if(numbers.length == 1) return numbers[0];
        for (int i=0; i<numbers.length; i++) {
            int j = i+1;
            if(j<numbers.length && numbers[i] > numbers[j]) return numbers[j];
        }

        return numbers[0];
    }
}
