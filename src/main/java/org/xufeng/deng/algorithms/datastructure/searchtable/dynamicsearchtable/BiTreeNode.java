package org.xufeng.deng.algorithms.datastructure.searchtable.dynamicsearchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/11.
 * <p>二叉排序树结点
 *
 * @author deng.xufeng
 */
public class BiTreeNode {
    private Integer key;
    private BiTreeNode lChild;
    private BiTreeNode rChild;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public BiTreeNode getlChild() {
        return lChild;
    }

    public void setlChild(BiTreeNode lChild) {
        this.lChild = lChild;
    }

    public BiTreeNode getrChild() {
        return rChild;
    }

    public void setrChild(BiTreeNode rChild) {
        this.rChild = rChild;
    }
}
