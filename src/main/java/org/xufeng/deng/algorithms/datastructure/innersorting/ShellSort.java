package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * <p>插入排序--希尔排序 不稳定 another-name:缩小增量排序 O(n)
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ShellSort {

    private static int[] dlta = {5, 3, 1};//增量序列dlta取值见P272
    private static Integer[] values = {0, 49, 38, 65, 97, 76, 13, 27, 49, 55, 4};//values[0]为暂存单元 不是哨兵

    private static void shellSort(Integer[] values, int dk) {
        //对直接插入排序作了一下修改：
        //  1.前后记录位置的增量是dk，而不是1
        //  2.values[0]只是暂存单元，不是哨兵。当j<=0时，插入位置已找到
        for (int i = dk + 1; i < values.length; ++i) {
            if (values[i] < values[i - dk]) {
                values[0] = values[i];
                int j = i - dk;
                for (; j > 0 && values[0] < values[j]; j -= dk) {
                    values[j + dk] = values[j];
                }
                //插入
                values[j + dk] = values[0];
            }
        }
    }

    public static void main(String[] args) {
        for (int aDlta : dlta) {
            shellSort(values, aDlta);
            System.out.println(Arrays.deepToString(values));
        }

    }
}
