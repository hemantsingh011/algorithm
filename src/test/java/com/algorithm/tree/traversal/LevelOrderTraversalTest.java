package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LevelOrderTraversalTest {
    private final LevelOrderTraversal levelOrderTraversal;

    public LevelOrderTraversalTest(){
        levelOrderTraversal = new LevelOrderTraversal();

    }


    @Test
    public void test_NonRecursiveImplementation(){
        //Given
        TreeNode<Integer> tree = TreeTestUtil.createTree();
        //When
        List<Integer> integers = levelOrderTraversal.withoutRecursion(tree);
        //Then
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Assert.assertEquals(expected, integers);
    }

}