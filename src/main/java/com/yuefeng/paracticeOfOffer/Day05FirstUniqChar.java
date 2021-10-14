package main.java.com.yuefeng.paracticeOfOffer;

import java.util.*;

public class Day05FirstUniqChar {

    public static void main(String[] args) {
        Day05FirstUniqChar d = new Day05FirstUniqChar();
        System.out.println(d.firstUniqChar("loveleetcode"));;
    }


    public char firstUniqChar(String s) {

        LinkedHashMap<Character, Boolean> lhm = new LinkedHashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (lhm.containsKey(c)) {
                lhm.put(c, false);
            } else {
                lhm.put(c, true);
            }

        }

        for (Map.Entry<Character, Boolean> kv : lhm.entrySet()) {
            if (kv.getValue()) return kv.getKey();
        }

        return ' ';
    }

    public char firstUniqChar1(String s) {

        HashMap<Character, Boolean> hm = new HashMap<>();
        char[] cs = s.toCharArray();

        for (char c : cs) {
            hm.put(c, hm.containsKey(c));
        }

        for (char c : cs) {
            if (!hm.get(c)) return c;
        }

        return ' ';
    }
}
