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
        adj[t].add(s);
    }

    public void createDemoGraph() {
        addEdge(0, 1);
        addEdge(0, 3);
        addEdge(1, 2);
        addEdge(1, 4);

        addEdge(3, 4);
        addEdge(2, 5);
        addEdge(4, 5);
        addEdge(4, 5);
        addEdge(5, 7);
        addEdge(6, 7);
    }
}