package org.xufeng.deng.algorithms.datastructure.searchtable.dynamicsearchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/11.
 * <p>平衡二叉树相关操作
 *
 * @author deng.xufeng
 */
public class AVLOperation {


    private AVLTreeNode rRotate(AVLTreeNode p) {
        //对根结点为p的二叉排序树做右旋处理，处理之后返回指向新的树根结点p
        AVLTreeNode lc = p.getlChild();
        p.setlChild(lc.getrChild());
        lc.setrChild(p);
        p = lc;
        return p;
    }

    private AVLTreeNode lRotate(AVLTreeNode p) {
        //对以p为根的二叉树作左旋处理，处理之后p指向新的树根结点。即旋转处理之前的有指数的根结点
        AVLTreeNode rc = p.getrChild();
        p.setrChild(rc.getlChild());
        rc.setlChild(p);
        p = rc;
        return p;
    }

    private AVLTreeNode leftBalance(AVLTreeNode T) {
        //对以T所指结点为根的二叉树做左平衡旋转处理，旋转结束后，指针T指向新的根结点
        AVLTreeNode lc = T.getlChild();
        switch (lc.getBf()) {
            case 1: //左高LH,新节点插入在T的左孩子的左子树上，做单右旋处理
                T.setBf(0);
                lc.setBf(0);
                T = rRotate(T);
                break;
            case -1: //右高RH，新结点插入在T的左孩子的右子树上，做双旋处理，先左后右
                AVLTreeNode rd = lc.getrChild();
                switch (rd.getBf()) {
                    case 1:
                        T.setBf(-1);
                        lc.setBf(0);
                        break;
                    case 0:
                        T.setBf(0);
                        lc.setBf(0);
                        break;
                    case -1:
                        T.setBf(0);
                        lc.setBf(1);
                        break;
                }
                rd.setBf(0);
                T.setlChild(lRotate(T.getlChild()));
                T = rRotate(T);
                break;
        }
        return T;
    }

    private AVLTreeNode rightBalance(AVLTreeNode T) {
        //对以T所指结点为根的二叉树做右平衡旋转处理，处理结束，T指向新结点的根结点
        AVLTreeNode rc = T.getrChild();
        switch (rc.getBf()) {
            case 1: //新结点插入在T的右孩子的做左子树上，做双旋处理，先右旋再左旋
                AVLTreeNode ld = rc.getlChild();
                switch (ld.getBf()) {
                    case 1:
                        T.setBf(0);
                        rc.setBf(-1);
                        break;
                    case 0:
                        T.setBf(0);
                        rc.setBf(0);
                        break;
                    case -1:
                        T.setBf(1);
                        rc.setBf(0);
                        break;
                }
                ld.setBf(0);
                T.setrChild(rRotate(T.getrChild()));
                T = lRotate(T);
                break;
            case -1: // 新结点插入在T的右孩子的右结点上，作单左旋处理
                T.setBf(0);
                rc.setBf(0);
                T = lRotate(T);
                break;
        }
        return T;
    }

    private AVLInsertResult insertAVL(AVLTreeNode T, Integer e, boolean taller) {
        //若在平衡的二叉树T中不存在和e有相同的关键字的结点，则插入一个数据元素为e的新结点，并返回reuslt=true，否则result=false
        //若因插入而使二叉排序树失去平衡，则是平衡旋转处理，taller反映T是否长高
        AVLInsertResult insertResult = new AVLInsertResult();
        boolean result = false;
        if (T == null) {
            T = new AVLTreeNode();
            T.setBf(0);
            T.setData(e);
            taller = true;
            result = true;
        } else {
            if (e.compareTo(T.getData())==0){
                insertResult.setNode(T);
                insertResult.setResult(false);
                insertResult.setResult(false);
                return insertResult;
            }
            if (e.compareTo(T.getData())<0){//在左子树中进行搜索
                insertResult = insertAVL(T.getlChild(),e,taller);
                if (!insertResult.isResult()){ //未插入
                    insertResult.setNode(T);
                    insertResult.setTaller(false);
                    return insertResult;
                }
                result = true;
                T.setlChild(insertResult.getNode());
                if (insertResult.isTaller()){ //已插入到左子树中且左子树长高
                    switch (T.getBf()){ //检查树T的平衡度
                        case 1: //原本左子树比右子树高，需要做左平衡处理
                            T = leftBalance(T);
                            taller = false;
                            break;
                        case 0: //原本左子树和右子树等高，现因左子树增高而使树增高
                            T.setBf(1);
                            taller = true;
                            break;
                        case -1: //原本右子树比左子树高，现左右子树等高
                            T.setBf(0);
                            taller = false;
                            break;
                    }
                }
            }else { // 在右子树中进行搜索
                insertResult = insertAVL(T.getrChild(),e,taller);
                if (!insertResult.isResult()){ //未插入
                    insertResult.setNode(T);
                    insertResult.setTaller(false);
                    return insertResult;
                }
                result = true;
                T.setrChild(insertResult.getNode());
                if (insertResult.isTaller()){
                    switch(T.getBf()){
                        case 1: // 原本左子树比右子树高，现左子树与右子树等高
                            T.setBf(0);
                            taller = false;
                            break;
                        case 0: // 原本左右子树等高，现因右子树增高而使树增高
                            T.setBf(-1);
                            taller = true;
                            break;
                        case -1: // 原本右子树比左子树高，需要作右平衡处理
                            T= rightBalance(T);
                        taller = false;
                            break;
                    }
                }
            }
        }

        insertResult.setTaller(taller);
        insertResult.setResult(result);
        insertResult.setNode(T);
        return insertResult;
    }


    public static void main(String[] args) {
        Integer[] values = {13,24,37,90,53,};
        AVLTreeNode T = null;
        AVLOperation operation = new AVLOperation();
        for (Integer value:values){
            T = operation.insertAVL(T,value,false).getNode();
        }
    }
}
