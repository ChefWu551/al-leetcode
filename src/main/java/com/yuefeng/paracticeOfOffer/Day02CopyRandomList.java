package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.NodeR;

import java.util.HashMap;
import java.util.Map;

//https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/solution/
public class Day02CopyRandomList {
    Map<NodeR, NodeR> nodes = new HashMap<>();

    public NodeR copyRandomList(NodeR head) {
        if(head == null) return head;
        if(!nodes.containsKey(head)) {
            NodeR n = new NodeR(head.val);
            nodes.put(head, n);

            n.next = copyRandomList(head.next);
            n.random = copyRandomList(head.random);
        }

        return nodes.get(head);
    }
}
