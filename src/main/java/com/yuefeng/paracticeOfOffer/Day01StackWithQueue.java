package main.java.com.yuefeng.paracticeOfOffer;

import java.util.Stack;

// https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
public class Day01StackWithQueue {

    class CQueue {
        Stack<Integer> s1;
        Stack<Integer> s2;

        public CQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void appendTail(int value) {
            while(!s1.empty()) {
                s2.push(s1.pop());
            }

            s1.push(value);
            while(!s2.empty()) {
                s1.push(s2.pop());
            }
        }

        public int deleteHead() {
            if(s1.empty()) return -1;
            return s1.pop();
        }
    }
}
