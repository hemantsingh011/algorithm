package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;

import java.util.*;

public class LevelOrderTraversal {

    public <T> List<T> withoutRecursion(TreeNode<T> tree){
        List<T> list = new ArrayList<>();
        Queue<TreeNode<T>> tempQ = new LinkedList<>();

        tempQ.add(tree);

        while(!tempQ.isEmpty()){
            TreeNode<T> tempNode = tempQ.poll();
            if(tempNode!=null){
                list.add(tempNode.getData());
                if(tempNode.getLeftNode() != null){
                    tempQ.add(tempNode.getLeftNode());
                }
                if(tempNode.getRightNode() != null){
                    tempQ.add(tempNode.getRightNode());
                }

            }
        }
        return list;
    }
}
