package main.java.com.yuefeng.bTreePractice;

import main.java.com.yuefeng.model.Node;

public class BTreeFind {

    public Node find(int value, Node tree) {
        Node m = tree;
        while (m != null) {
            if (m.data > value) {
                m = m.left;
            } else if (m.data < value){
                m = m.right;
            } else {
                return m;
            }
        }

        return null;
    }

}
