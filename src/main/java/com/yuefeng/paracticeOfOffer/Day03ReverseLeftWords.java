package main.java.com.yuefeng.paracticeOfOffer;

public class Day03ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
