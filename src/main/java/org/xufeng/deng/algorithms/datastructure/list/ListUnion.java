package org.xufeng.deng.algorithms.datastructure.list;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/5/9.
 * <p>算法2.1 union list
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ListUnion<T> {

    /**
     * 将所有在A中不再B中的数据元素插入到A中
     *
     * @param listA 线性表A
     * @param listB 线性表B
     */
    public void union(List<T> listA, List<T> listB){
        int listBLength =listB.size();
        for (T value : listB) {
            // 如果泛型不是基本数据类型或包装器 要用collection 或 list 等集合的contains方法
            // ，需要重写equals() hashCode()
            if (!listA.contains(value)) {
                listA.add(value);
            }
        }
    }
}
