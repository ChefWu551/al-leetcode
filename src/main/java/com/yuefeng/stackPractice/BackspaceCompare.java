package main.java.com.yuefeng.stackPractice;

import javax.print.DocFlavor;
import java.util.Stack;

//https://leetcode-cn.com/problems/backspace-string-compare/
public class BackspaceCompare {

    public static void main(String[] args) {
        String s = "";
        String t = "";
    }

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = pushStack(s);
        Stack<Character> t1 = pushStack(t);

        while (!s1.empty() && !t1.empty()) {
            if (s1.pop() != t1.pop()) return false;
        }

        return s1.empty() && t1.empty();
    }

    public Stack<Character> pushStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) != '#') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.empty()) stack.pop();
            }
        }

        return stack;
    }
}
