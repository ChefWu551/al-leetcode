package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
public class Day13String_ReverseWords {

    public static void main(String[] args) {
        String s = "a good   example";

        Day13String_ReverseWords d = new Day13String_ReverseWords();

        System.out.println(d.reverseWords(s));
    }

    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1;
        int i = j;
        StringBuilder result = new StringBuilder();
        while (j >=0) {
            while ( j >= 0 && s.charAt(j) != ' ') j--;
            result.append(s.substring(j+1, i+1)).append(" ");
            while ( j >= 0 && s.charAt(j) == ' ') j--;
            i = j;
        }

        return result.toString().trim();
    }


    

}
