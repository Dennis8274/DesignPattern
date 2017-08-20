package org.xufeng.deng.algorithms.datastructure.tree.binary;

/**
 * Created by deng.xufeng(一乐) on 2017/5/17.
 * <p>先序遍历二叉树
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class PreOrderTraverse {

    public static BiTree rootBiTree = new BiTree();
    public static int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static BiTree createBiTree(BiTree rootBiTree, int[] values, int index) {
        //构建一个完全二叉树
        if (index < values.length) {
            if (values[index] == 0) {
                rootBiTree = null;
            } else {
                rootBiTree = new BiTree();
                rootBiTree.setData(values[index]);
                rootBiTree.setlChild(createBiTree(rootBiTree.getlChild(), values, 2 * index));
                rootBiTree.setrChild(createBiTree(rootBiTree.getrChild(), values, 2 * index + 1));
            }
        }
        return rootBiTree;
    }

    private static boolean preOrderTraverse(BiTree rootBiTree) {
        if (null != rootBiTree) {
            if (visit(rootBiTree)) {
                if (preOrderTraverse(rootBiTree.getlChild())) {
                    if (preOrderTraverse(rootBiTree.getrChild())) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    private static boolean visit(BiTree node) {
        System.out.println("node:" + node.getData());
        return true;
    }

    public static void main(String[] args) {
        BiTree biTree = null;
        biTree = createBiTree(biTree, values, 1);
        preOrderTraverse(biTree);
    }

}
