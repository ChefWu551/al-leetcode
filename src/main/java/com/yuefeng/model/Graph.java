package main.java.com.yuefeng.model;

import java.util.LinkedList;


public class Graph { // 无向图
    private int v; // 顶点的个数

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public void setAdj(LinkedList<Integer>[] adj) {
        this.adj = adj;
    }

    private LinkedList<Integer>[] adj; // 邻接表

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i) {
            adj[i] = new LinkedList<>();
        }

        createDemoGraph();
    }

    public void addEdge(int s, int t) { // 无向图一条边存两次
        adj[s].add(t);
//        adj[t].add(s);
    }

    public void createDemoGraph() {
        addEdge(0, 1);
        addEdge(0, 3);
        addEdge(1, 2);
        addEdge(1, 4);

        addEdge(3, 4);
        addEdge(2, 5);
        addEdge(4, 5);
        addEdge(5, 7);
    }


    public void topoSortByKahn() {
        int[] inDegree = new int[v]; // 统计每个顶点的入度
        for (int i = 0; i < v; ++i) {
            for (int j = 0; j < adj[i].size(); ++j) {
                int w = adj[i].get(j); // i->w
                inDegree[w]++;
            }
        }
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < v; ++i) {
            if (inDegree[i] == 0) queue.add(i);
        }
        while (!queue.isEmpty()) {
            int i = queue.remove();
            System.out.print("->" + i);
            for (int j = 0; j < adj[i].size(); ++j) {
                int k = adj[i].get(j);
                inDegree[k]--;
                if (inDegree[k] == 0) queue.add(k);
            }
        }
    }
}