package org.xufeng.deng.algorithms.datastructure.searchtable.dynamicsearchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/11.
 * <p>平衡二叉树结点，又称BBT
 *
 * @author deng.xufeng
 */
public class AVLTreeNode {
    private Integer data;
    private int bf;
    private AVLTreeNode lChild;
    private AVLTreeNode rChild;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public int getBf() {
        return bf;
    }

    public void setBf(int bf) {
        this.bf = bf;
    }

    public AVLTreeNode getlChild() {
        return lChild;
    }

    public void setlChild(AVLTreeNode lChild) {
        this.lChild = lChild;
    }

    public AVLTreeNode getrChild() {
        return rChild;
    }

    public void setrChild(AVLTreeNode rChild) {
        this.rChild = rChild;
    }
}
