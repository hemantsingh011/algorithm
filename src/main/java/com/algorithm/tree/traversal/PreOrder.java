package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {


    private final List<Integer> list = new ArrayList<>();

    public List<Integer> traversalWithRecursion(TreeNode<Integer> tree){
        if(tree != null) {
            list.add(tree.getData());
            traversalWithRecursion(tree.getLeftNode());
            traversalWithRecursion(tree.getRightNode());
        }
        return list;
    }

    public <T> List<T> traversalWithoutRecursion(TreeNode<T> tree){
        List<T> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        list.add(tree.getData());
        stack.push(tree);

        while(true){
            while(tree.getLeftNode() != null){
                tree = tree.getLeftNode();
                stack.push(tree);
                list.add(tree.getData());
            }

            if(stack.empty()){
                break;
            } else {
                TreeNode<Integer> node = stack.pop();
                if(node.getRightNode() != null){
                    tree = node.getRightNode();
                    stack.push(tree);
                    list.add(tree.getData());
                }
            }
        }
        return list;
    }
}
