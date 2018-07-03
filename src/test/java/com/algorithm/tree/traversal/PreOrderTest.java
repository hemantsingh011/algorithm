package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PreOrderTest {

    private final PreOrder preOrder;

    public PreOrderTest(){
         preOrder = new PreOrder();

    }

    @Test
    public void test_RecursiveImplementation(){
        //Given
        TreeNode<Integer> tree = TreeTestUtil.createTree();
        //When
        List<Integer> integers = preOrder.traversalWithRecursion(tree);
        //Then
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        Assert.assertEquals(expected, integers);
    }
    @Test
    public void test_NonRecursiveImplementation(){
        //Given
        TreeNode<Integer> tree = TreeTestUtil.createTree();
        //When
        List<Integer> integers = preOrder.traversalWithoutRecursion(tree);
        //Then
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        Assert.assertEquals(expected, integers);
    }

}