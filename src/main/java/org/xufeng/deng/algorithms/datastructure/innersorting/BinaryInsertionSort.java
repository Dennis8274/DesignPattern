package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * Created by deng.xufeng(一乐) on 2017/6/2.
 * <p>插入排序--折半插入排序 顺序表 O(n2)
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class BinaryInsertionSort {

    private static Integer[] values = {0, 2, 4, 5, 2, 7, 9, 10, 3, 6, 8, 11};//values[0]为哨兵

    public static void main(String[] args) {
        for (int i = 2; i < values.length; ++i) {
            values[0] = values[i];
            int low = 1;
            int high = i - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (values[0] < values[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.arraycopy(values, high + 1, values, high + 2, i - (high + 1));
//            for (int j = i - 1; j >= high + 1; --j) {
//                values[j + 1] = values[j];
//            }
            values[high + 1] = values[0];
        }

        System.out.println(Arrays.deepToString(values));
    }
}
