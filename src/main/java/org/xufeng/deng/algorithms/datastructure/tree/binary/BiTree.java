package org.xufeng.deng.algorithms.datastructure.tree.binary;

/**
 * Created by deng.xufeng(一乐) on 2017/5/17.
 * <p>二叉树的存储结构分为顺序和链式
 * 顺序存储用特定的符号便是为空，数组按满二叉树顺序表示二叉树。遍历顺序存储结构的二叉树时，比较麻烦，核心是记住左孩子是2i，有孩子是2i+1.
 * 链式存储有两个或三个指针域，用以表示左孩子、右孩子、父结点。
 *
 *
 * 该结构为链式存储二叉树结构
 * @author deng.xufeng
 */
public class BiTree {
    private Integer data;
    private BiTree lChild;
    private BiTree rChild;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BiTree getlChild() {
        return lChild;
    }

    public void setlChild(BiTree lChild) {
        this.lChild = lChild;
    }

    public BiTree getrChild() {
        return rChild;
    }

    public void setrChild(BiTree rChild) {
        this.rChild = rChild;
    }

    public void setNode(Integer data,BiTree lChild,BiTree rChild){
        this.setData(data);
        this.setlChild(lChild);
        this.setrChild(rChild);
    }

    @Override
    public String toString() {
        return "BiTree{" +
                "data=" + data +
                ", lChild=" + lChild.getData() +
                ", rChild=" + rChild.getData() +
                '}';
    }
}
