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
    public void insert(int val)
    {
        TreeNode newNode=new TreeNode(val);    // local object creation
        if(root==null)
            root=newNode;
        else{
            TreeNode current = root;
            TreeNode present=null;
            while (current!=null) {
                present = current;
                if(newNode.getData()<current.getData()) {
                    current = current.getLeft();
                }
                else {
                    current = current.getRight();
                }
                if (newNode.getData()<present.getData()){
                    present.setLeft(newNode);
                }
                else
                    present.setRight(newNode);
            }
        }
    }
