package main.java.com.yuefeng;

import main.java.com.yuefeng.model.Graph;

public class GraphTest {

    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.topoSortByKahn();
        System.out.println(g);
    }
}
