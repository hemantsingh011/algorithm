package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PreOrderTest {

    private final PreOrder preOrder;

    public PreOrderTest(){
         preOrder = new PreOrder();

    }

    @Test
    public void test_RecursiveImplementation(){
        //Given
        TreeNode<Integer> tree = createTree();
        //When
        List<Integer> integers = preOrder.traversalWithRecursion(tree);
        //Then
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        Assert.assertEquals(expected, integers);
    }
    @Test
    public void test_NonRecursiveImplementation(){
        //Given
        TreeNode<Integer> tree = createTree();
        //When
        List<Integer> integers = preOrder.traversalWithoutRecursion(tree);
        //Then
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        Assert.assertEquals(expected, integers);
    }

    private TreeNode createTree(){
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