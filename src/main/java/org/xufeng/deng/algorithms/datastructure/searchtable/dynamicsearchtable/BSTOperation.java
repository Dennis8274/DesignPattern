package org.xufeng.deng.algorithms.datastructure.searchtable.dynamicsearchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/11.
 * <p>二叉排序树相关操作,由于java的值引用特性走了很多弯路
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class BSTOperation {

    private SearchResult searchBST(BiTreeNode T, Integer key, BiTreeNode f, BiTreeNode p) {
        //在指针T所知二叉排序树中递归地查找其关键字等于key的数据元素，若查找成功，则指针p指向该数据元素结点
        // ，并返回true,否则指针p指向查找路径上访问的最后一个结点并返回false，指针f指向T的双亲，其初始调用值为NULL。
        if (T == null || T.getKey() == null) {
            p = f;
            return new SearchResult(false, p);
        } else if (key.compareTo(T.getKey()) == 0) {
            p = T;
            return new SearchResult(true, p);
        } else if (key.compareTo(T.getKey()) < 0) {
            return searchBST(T.getlChild(), key, T, p);
        } else {
            return searchBST(T.getrChild(), key, T, p);
        }
    }

    private BiTreeNode insertBST(BiTreeNode T, Integer e) {
        BiTreeNode treeNode = null;
        SearchResult searchResult = searchBST(T, e, null, null);
        BiTreeNode p = searchResult.getP();
        if (!searchResult.getResult()) {
            BiTreeNode s = new BiTreeNode();
            s.setKey(e);
            s.setlChild(null);
            s.setrChild(null);
            if (p == null || p.getKey() == null) {
                T = s;
            } else if (e.compareTo(p.getKey()) < 0) {
                p.setlChild(s);
            } else {
                p.setrChild(s);
            }
            return T;
        } else {
            return null;
        }
    }

    private BiTreeNode getNode(BiTreeNode T, Integer key) {
        if (T == null || T.getKey() == null) {
            return null;
        } else if (key.compareTo(T.getKey()) == 0) {
            return T;
        } else if (key.compareTo(T.getKey()) < 0) {
            return getNode(T.getlChild(),key);
        } else {
            return getNode(T.getrChild(),key);
        }
    }

    private BiTreeNode getParentNode(BiTreeNode T,Integer key,BiTreeNode p){
        if (T==null||T.getKey()==null){
            return null;
        }else if (T.getKey().compareTo(key)==0){
            return p;
        }else if (key.compareTo(T.getKey())<0){
            return getParentNode(T.getlChild(),key,T);
        }else {
            return getParentNode(T.getrChild(),key,T);
        }
    }

    private BiTreeNode deleteBST(BiTreeNode T, Integer key) {
        //从二叉排序树中删除结点p，并重新连接它的左或右子树
        //分3种情况讨论，篇幅过大，具体请参考P229
        //其中当左右子树部位空的情况有两种处理方式P230
        if (T == null) {
            return null;
        } else {
                BiTreeNode delNode = getNode(T,key);
                BiTreeNode p = getParentNode(T,key,null);
                if (delNode.getlChild()==null){//左子树为空
                    if (p.getlChild() != null && p.getlChild().getKey().compareTo(delNode.getKey())==0 ) {
                        p.setlChild(delNode.getrChild());
                    } else {
                        p.setrChild(delNode.getrChild());
                    }
                }else if (delNode.getrChild()==null){//右子树为空
                    if (p.getlChild() != null && p.getlChild().getKey().compareTo(delNode.getKey())==0 ) {
                        p.setlChild(delNode.getlChild());
                    } else {
                        p.setrChild(delNode.getlChild());
                    }
                }else {//左右子树均部位空
                    BiTreeNode q = delNode;
                    BiTreeNode s = delNode.getlChild();
                    while (s.getrChild() != null) { //到最右，取得最右孩子
                        q = s;
                        s = s.getrChild();
                    }
                    delNode.setKey(s.getKey());
                    if (q.getKey().compareTo(delNode.getKey())!=0){
                        q.setrChild(s.getlChild());
                    }else {
                        q.setlChild(s.getlChild());
                    }
                }
                return T;
        }
    }

    private BiTreeNode createBST() {
        Integer[] values = {45, 24, 12, 53, 90};
        BiTreeNode T = null;
        for (Integer value : values) {
            T = insertBST(T, value);
        }

        return T;
    }


    public static void main(String[] args) {
        BSTOperation oper = new BSTOperation();
        BiTreeNode T = oper.createBST();
        T = oper.deleteBST(T, 12);
        System.out.println(T);
    }
}
