package main.java.com.yuefeng.paracticeOfOffer;

import java.util.Stack;

// https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
public class Day01MinStack {
    class MinStack {
        Stack<Integer> min;
        Stack<Integer> s;

        /** initialize your data structure here. */
        public MinStack() {
            min = new Stack<>();
            min.push(Integer.MAX_VALUE);
            s= new Stack<>();
        }

        public void push(int x) {
            s.push(x);
            min.push(Math.min(min.peek(), x));
        }

        public void pop() {
            min.pop();
            s.pop();
        }

        public int top() {
            return s.peek();
        }

        public int min() {
            return min.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}
