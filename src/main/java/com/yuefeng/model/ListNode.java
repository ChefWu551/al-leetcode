package main.java.com.yuefeng.model;

public class ListNode {
    public int val;            //数据 ：节点数据
    public ListNode next;      //对象 ：引用下一个节点对象。在Java中没有指针的概念，Java中的引用和C语言的指针类似

    public ListNode(int val){  //构造方法 ：构造方法和类名相同
        this.val=val;   //把接收的参数赋值给当前类的val变量
        next = null;
    }

    public ListNode() {

    }

}
