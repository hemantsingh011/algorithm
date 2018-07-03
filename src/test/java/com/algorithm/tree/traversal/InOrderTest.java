package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InOrderTest {

    private final InOrder inOrder;

    public InOrderTest(){
        inOrder = new InOrder();

    }

    @Test
    public void test_RecursiveImplementation(){
        //Given
        TreeNode<Integer> tree = TreeTestUtil.createTree();
        //When
        List<Integer> integers = inOrder.withoutRecursion(tree);
        //Then
        List<Integer> expected = Arrays.asList(4,2,5,1,6,3,7);
        Assert.assertEquals(expected, integers);
    }

}