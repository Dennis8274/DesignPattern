package org.xufeng.deng.algorithms.datastructure.searchtable.dynamicsearchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/11.
 * <p>针对java和c的区别（参数引用的区别、回收机制，方法域等区别），设置一个查找结果对象
 *
 * @author deng.xufeng
 */
public class SearchResult {
    private Boolean result;
    private BiTreeNode p;//指向双亲结点

    public SearchResult() {
    }

    public SearchResult(Boolean result, BiTreeNode p) {
        this.result = result;
        this.p = p;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public BiTreeNode getP() {
        return p;
    }

    public void setP(BiTreeNode p) {
        this.p = p;
    }
}
