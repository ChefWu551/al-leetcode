package main.java.com.yuefeng.bTreePractice;

import main.java.com.yuefeng.model.Node;

public class BTreeInsert {

    public void insert(Node tree, int value) {
        if (tree == null) {
            tree = new Node(value);
            return;
        }

        Node m = tree;

        while (true) {
            if (value > m.data) {
                if (m.right == null) {
                    m.right = new Node(value);
                    return;
                }

                m = m.right;
            } else {
                if (m.left == null) {
                    m.left = new Node(value);
                    return;
                }

                m = m.left;
            }
        }
    }
}
