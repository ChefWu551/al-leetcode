package main.java.com.yuefeng.stackPractice;

// 有效的括号

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
// 
//
//示例 1：
//
//输入：s = "()"
//输出：true
//示例 2：
//
//输入：s = "()[]{}"
//输出：true
//示例 3：
//
//输入：s = "(]"
//输出：false
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/valid-parentheses
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid(")}"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Map<Character, Character> maps = new HashMap<>();
        maps.put('}', '{');
        maps.put(']', '[');
        maps.put(')', '(');

        Stack<Character> stack = new Stack<Character>();
        for (int i =0; i<s.length(); i++) {
            char value = s.charAt(i);
            if (value == ']' || value == '}' || value == ')') {
                if (stack.empty()) return false;
                char stackValue = stack.pop();
                if (stackValue != maps.get(value)) {
                    return false;
                }

                continue;
            }

            stack.push(value);
        }

        return stack.empty();
    }
}
