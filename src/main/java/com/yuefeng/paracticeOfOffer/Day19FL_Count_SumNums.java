package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

// 逻辑运算符的短路效应
// https://leetcode-cn.com/problems/qiu-12n-lcof/
public class Day19FL_Count_SumNums {

    public static void main(String[] args) {
        Day19FL_Count_SumNums d = new Day19FL_Count_SumNums();
        d.sumNums(3);
    }

    int res = 0;
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }

    int result = 0;

    public int sumNums01(int n) {
        recursion(n, 0);
        return result;
    }

    public boolean recursion(int n, int mov) {
        result = result + mov;
        mov++;
        return mov <= n && recursion(n, mov);
    }

}
