package com.algorithm.tree.traversal;

import com.algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {


    private final List<Integer> list = new ArrayList<>();

    public List<Integer> traversalWithRecursion(TreeNode<Integer> tree) {
        if (tree != null) {
            list.add(tree.getData());
            traversalWithRecursion(tree.getLeftNode());
            traversalWithRecursion(tree.getRightNode());
        }
        return list;
    }

    public <T> List<T> traversalWithoutRecursion(TreeNode<T> root) {
        List<T> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode<T> tree = root;

        while (true) {
            while (tree != null) {
                list.add(tree.getData());
                stack.push(tree);
                tree = tree.getLeftNode();
            }

            if (stack.empty()) {
                break;
            } else {
                TreeNode<Integer> node = stack.pop();
                if (node.getRightNode() != null) {
                    tree = node.getRightNode();
                }
            }
        }
        return list;
    }

}
