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
    public void insert(int data)
    {
        TreeNode node=new TreeNode(data);
        if(root==null)
            root=node;
        else{
            TreeNode current=root;
            TreeNode parent=null;
            while (current!=null){
                parent=current;
                if(node.getData()<current.getData())
                    current=current.getLeft();
                else
                    current=current.getRight();
            }
            if(node.getData()<parent.getData())
                parent.setLeft(node);
            else
                parent.setRight(node);
            }
        }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public MyQueue getPre() {
        return pre;
    }

    public void setPre(MyQueue pre) {
        this.pre = pre;
    }

    public MyQueue getPost() {
        return post;
    }

    public void setPost(MyQueue post) {
        this.post = post;
    }
}
}
