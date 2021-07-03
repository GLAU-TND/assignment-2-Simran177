/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        System.out.println("Left nodes of tree:");
        obj.traversal();
        System.out.println("No. of parents not having their left child are");
        System.out.println(obj.getCount());
    }
}
