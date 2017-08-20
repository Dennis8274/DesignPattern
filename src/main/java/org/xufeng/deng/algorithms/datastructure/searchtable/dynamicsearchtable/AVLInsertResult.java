package org.xufeng.deng.algorithms.datastructure.searchtable.dynamicsearchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/11.
 * <p>
 *
 * @author deng.xufeng
 */
public class AVLInsertResult {
    private boolean result;
    private AVLTreeNode node;
    private boolean taller;

    public AVLInsertResult() {
    }

    public AVLInsertResult(boolean result, AVLTreeNode node, boolean taller) {
        this.result = result;
        this.node = node;
        this.taller = taller;
    }

    public boolean isTaller() {
        return taller;
    }

    public void setTaller(boolean taller) {
        this.taller = taller;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public AVLTreeNode getNode() {
        return node;
    }

    public void setNode(AVLTreeNode node) {
        this.node = node;
    }
}
