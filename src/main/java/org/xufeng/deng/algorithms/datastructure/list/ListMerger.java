package org.xufeng.deng.algorithms.datastructure.list;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/5/9.
 * <p>线性表合并
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ListMerger {
    public List<Integer> mergeList(List<Integer> listA, List<Integer> listB) {
        int listALen = listA.size();
        int listBLen = listB.size();
        List<Integer> mergeResult = Lists.newArrayList();
        int i = 0;
        int j = 0;

        while (i < listALen && j < listBLen) {
            Integer valueA = listA.get(i);
            Integer valueB = listB.get(j);
            if (valueA <= valueB) {
                ++i;
                mergeResult.add(valueA);
            } else {
                ++j;
                mergeResult.add(valueB);
            }
        }

        while (i < listALen) {
            mergeResult.add(listA.get(i));
            ++i;
        }

        while (j < listBLen) {
            mergeResult.add(listB.get(j));
            ++j;
        }
        return mergeResult;
    }
}
