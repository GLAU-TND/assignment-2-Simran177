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
    public void preOrder(TreeNode current)          //Inorder Traversal DLR(Stack Formation)
    {
        if (current == null)
            return;
        else {
            pre.enqueue(current.getData());
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void inOrder(TreeNode current) {
        if (current == null)
            return;
        else {
            inOrder(current.getLeft());
            System.out.println(current.getData());
            inOrder(current.getRight());
        }
    }
    public void postOrder(TreeNode current)
    {
        if(current==null)
            return;
        else{
            postOrder(current.getLeft());
            postOrder(current.getRight());
            post.enqueue(current.getData());
        }
}
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void traversal(){
        TreeNode current = root;
        TreeNode parent = null;
        this.count = 0;
        while (current != null) {
            if (current.getLeft() == null) {
                count++;
            }
            if (parent.getData() == current.getData()) {
            }
            if (parent.getData() < current.getData()) {
                System.out.println(current.getData());
                current = current.getLeft();
            }
            if (parent.getData() > current.getData()) {
                current = current.getRight();
            }
        }


    }
}
