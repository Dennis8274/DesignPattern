package org.xufeng.deng.algorithms.datastructure.tree.binary;

import java.util.Stack;

/**
 * Created by deng.xufeng(一乐) on 2017/5/18.
 * <p>非递归遍历二叉树
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class NonCursivePreOrderTraverse {


    public static void main(String[] args) {
        BiTree rootBiTree = createBiTree();
        preOrderTraverse(rootBiTree);
    }

    private static void preOrderTraverse(BiTree rootBiTree) {
        Stack<BiTree> stack = initStack();
        stack.push(rootBiTree);
        while (!stack.isEmpty()) {
            BiTree node = stack.pop();
            visit(node);
            if (null != node.getrChild()) {
                stack.push(node.getrChild());
            }
            if (null != node.getlChild()) {
                stack.push(node.getlChild());
            }
        }
    }

    private static void visit(BiTree node) {
        System.out.println("node:" + node.getData());
    }

    private static Stack<BiTree> initStack() {
        return new Stack<>();
    }

    private static BiTree createBiTree() {
        return PreOrderTraverse.createBiTree(PreOrderTraverse.rootBiTree, PreOrderTraverse.values, 1);
    }
}
