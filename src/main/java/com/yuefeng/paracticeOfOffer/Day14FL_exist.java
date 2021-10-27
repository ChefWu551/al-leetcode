package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
public class Day14FL_exist {

    public static void main(String[] args) {
        char[][] board = new char[1][1];
        board[0] = new char[]{'a'};
        Day14FL_exist d = new Day14FL_exist();
        d.exist(board, "b");
    }

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if (dfs(board, i, j, words, 0)) return true;
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int i, int j, char[] words, int k) {
        if (i<0 || i>=board.length || j<0 || j>=board[i].length|| board[i][j] != words[k]) return false;
        if(k == words.length - 1) return true;
        board[i][j] = '\0';
        boolean result = dfs(board, i+1, j, words, k+1) ||
                dfs(board, i-1, j, words, k+1) ||
                dfs(board, i, j+1, words, k+1) ||
                dfs(board, i, j-1, words, k+1);
        board[i][j] = words[k];

        return result;
    }

}
