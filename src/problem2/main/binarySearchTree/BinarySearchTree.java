package problem2.main.binarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;
public class BinarySearchTree {
    private  TreeNode root;
    private int count;
    private MyQueue pre;
    private MyQueue post;

    public BinarySearchTree(MyQueue pre,MyQueue post)
    {
        this.pre=pre;
        this.post=post;
    }
}
