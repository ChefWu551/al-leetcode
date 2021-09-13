package main.java.com.yuefeng.stackPractice;

import java.util.Stack;

// 155
//https://leetcode-cn.com/problems/min-stack/submissions/
public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minValue;


    public MinStack() {
        stack = new Stack<Integer>();
        minValue = new Stack<>();
        minValue.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minValue.push(Math.min(minValue.peek(), val));
    }

    public void pop() {
        stack.pop();
        minValue.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue.peek();
    }
}
