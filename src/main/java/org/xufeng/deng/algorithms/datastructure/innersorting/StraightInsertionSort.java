package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * <p>插入排序--直接插入排序 O(n2) 顺序表
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class StraightInsertionSort {

    private static Integer[] values = {0, 2, 4, 5, 2, 7, 9, 10, 3, 6, 8, 11};//values[0]为哨兵

    public static void main(String[] args) {
        for (int i = 2; i <= values.length - 1; ++i) {
            if (values[i] < values[i - 1]) {
                values[0] = values[i];
//                values[i] = values[i - 1];
                int j = i - 1;
                for (; values[0] < values[j]; --j) {
                    values[j + 1] = values[j];
                }
                values[j + 1] = values[0];
            }
        }

        System.out.println(Arrays.deepToString(values));
    }
}
