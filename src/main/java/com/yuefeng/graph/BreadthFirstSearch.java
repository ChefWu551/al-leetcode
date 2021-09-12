package main.java.com.yuefeng.graph;

import main.java.com.yuefeng.model.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Graph graph = new Graph(8);
        LinkedList<Integer>[] adj = graph.getAdj();
        BreadthFirstSearch.bfs(0, 7, adj);

        BreadthFirstSearch.practice(0, 7, adj);
    }

    // 解题关键：
    // 三个表，queue表用于记录待处理的节点；visited表用于记录已经访问的节点；values表用于记录节点的访问路径，以用来追溯最佳路径；
    // 基础知识延伸：boolean包装类初始化是null；而基础类初始化是false；这点可以参照jvm里面在基础类型初始化的情况来看；

    public static void practice(int s, int t, LinkedList<Integer>[] adj) {
        if (s == t) return;

        Queue<Integer> queue = new LinkedList<>(); // 用于记录待处理的节点
        queue.add(s);

        // 注意这里不要用包装类！因为包装类的boolean类型是null而不是false；
        boolean[] isVisit = new boolean[adj.length]; // 用于记录是否元素已经被处理过,
        isVisit[0] = true;

        int[] values = new int[adj.length]; // 初始化数组，用于记录轨迹
        for (int i=0; i<adj.length; i++) {
            values[i] = -1;
        }

        while (queue.size() != 0) {
            int currentValue = queue.poll();
            for (int i=0; i<adj[currentValue].size(); i++) {
                int childNode = adj[currentValue].get(i);
                if (!isVisit[childNode]) {
                    values[childNode] = currentValue;
                    if (childNode == t) {
                        print(values, s, t);
                        return;
                    }

                    queue.add(childNode);
                    isVisit[childNode] = true;  // 是当前使用的childNode，currentValue
                }

            }
        }
    }


    public static void bfs(int s, int t, LinkedList<Integer>[] adj) {
        if (s == t) return;
        int v = adj.length;
        boolean[] visited = new boolean[v];
        visited[s]=true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] prev = new int[v];
        for (int i = 0; i < v; ++i) {
            prev[i] = -1;
        }
        while (queue.size() != 0) {
            int w = queue.poll();
            for (int i = 0; i < adj[w].size(); ++i) {
                int currentValue = adj[w].get(i);
                if (!visited[currentValue]) {
                    prev[currentValue] = w;
                    if (currentValue == t) {
                        print(prev, s, t);
                        return;
                    }
                    visited[currentValue] = true;
                    queue.add(currentValue);
                }
            }
        }
    }

    private static void print(int[] prev, int s, int t) { // 递归打印s->t的路径
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }
        System.out.print(t + " ");
    }
}
