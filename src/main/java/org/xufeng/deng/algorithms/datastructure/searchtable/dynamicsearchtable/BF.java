package org.xufeng.deng.algorithms.datastructure.searchtable.dynamicsearchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/11.
 * <p>
 *
 * @author deng.xufeng
 */
public enum BF {
    LH(1),
    RH(-1),
    EH(0);
    private Integer value;

    BF(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
