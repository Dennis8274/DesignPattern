package org.xufeng.deng.algorithms.datastructure.searchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/7.
 * <p>查找树结点
 *
 * @author deng.xufeng
 */
public class BiTree {
    private String data;
    private int weight;
    private BiTree lChild;
    private BiTree rChild;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BiTree getlChild() {
        if (lChild==null){
            lChild = new BiTree();
        }
        return lChild;
    }

    public void setlChild(BiTree lChild) {
        this.lChild = lChild;
    }

    public BiTree getrChild() {
        if (rChild==null){
            rChild = new BiTree();
        }
        return rChild;
    }

    public void setrChild(BiTree rChild) {
        this.rChild = rChild;
    }
}
