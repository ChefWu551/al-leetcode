package main.java.com.yuefeng.graph;

import main.java.com.yuefeng.stack.Graph;

import java.util.LinkedList;

public class DepthFirstSearch {

    public boolean found;

    public static void main(String[] args) {
        Graph graph = new Graph(8);
        LinkedList<Integer>[] adj = graph.getAdj();
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.dfs(0, 6, adj);
    }

    public void dfs(int s, int t, LinkedList<Integer>[] adj) {
        int[] visitChain = new int[adj.length];
        for (int i=0; i< adj.length; i++) {
            visitChain[i] = -1;
        }

        boolean[] visited = new boolean[adj.length];
        this.recurDfs(s, t, adj, visited, visitChain);
        this.print(visitChain, s, t);
    }

    public void recurDfs(int s, int t, LinkedList<Integer>[] adj, boolean[] visited, int[] visitChain) {
        if (this.found) return; // 基准条件

        visited[s] = true;

        if (s == t) {
            found = true;
            return;
        }

        for(int i=0; i< adj[s].size(); i++) {
            int childValue = adj[s].get(i);
            if (!visited[childValue]) {
                visitChain[childValue] = s;
                this.recurDfs(childValue, t, adj, visited, visitChain);
            }
        }
    }

    private void print(int[] prev, int s, int t) { // 递归打印s->t的路径
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }

        System.out.print(t + " ");
    }
}
