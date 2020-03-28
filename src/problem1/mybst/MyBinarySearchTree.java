/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private int count;

    public void insert(int val) {
        TreeNode newNode = new TreeNode(val);    // local object creation
        if (root == null)
            root = newNode;
        else {
            TreeNode current = root;
            TreeNode present = null;
            while (current != null) {
                present = current;
                if (newNode.getData() < current.getData()) {
                    current = current.getLeft();
                } else {
                    current = current.getRight();
                }
                if (newNode.getData() < present.getData()) {
                    present.setLeft(newNode);
                } else
                    present.setRight(newNode);
            }
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    public void preOrder(TreeNode current)          //Inorder Traversal DLR(Stack Formation)
    {
        if(current==null)
            return;
        else {
            System.out.println(current.getData());
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }
    public void inOrder(TreeNode current)
    {
        if(current==null)
            return;
        else {
            inOrder(current.getLeft());
            System.out.println(current.getData());
            inOrder(current.getRight());
        }
    }
}

