package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {

    public <T> List<T> withoutRecursion(TreeNode<T> tree){
        List<T> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(tree);
        while(true){
            while(tree.getLeftNode() != null){
                tree = tree.getLeftNode();
                stack.push(tree);
            }
            if(stack.empty()){
                break;
            } else {
                TreeNode<T> node = stack.pop();
                list.add(node.getData());
                if(node.getRightNode() != null){
                    tree = node.getRightNode();
                    stack.push(tree);
                }
            }

        }

        return list;

    }
}
