package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;

public class TreeTestUtil {


    public static TreeNode createTree(){
        TreeNode<Integer> integerTreeNode1 = new TreeNode<Integer>(1);
        TreeNode<Integer> integerTreeNode2 = new TreeNode<Integer>(2);
        TreeNode<Integer> integerTreeNode3 = new TreeNode<Integer>(3);
        TreeNode<Integer> integerTreeNode4 = new TreeNode<Integer>(4);
        TreeNode<Integer> integerTreeNode5 = new TreeNode<Integer>(5);
        TreeNode<Integer> integerTreeNode6 = new TreeNode<Integer>(6);
        TreeNode<Integer> integerTreeNode7 = new TreeNode<Integer>(7);

        integerTreeNode1.setLeftNode(integerTreeNode2);
        integerTreeNode1.setRightNode(integerTreeNode3);

        integerTreeNode2.setLeftNode(integerTreeNode4);
        integerTreeNode2.setRightNode(integerTreeNode5);

        integerTreeNode3.setLeftNode(integerTreeNode6);
        integerTreeNode3.setRightNode(integerTreeNode7);

        return integerTreeNode1;
    }
}
