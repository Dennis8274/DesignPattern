package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/4
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] values = {3, 2, 4, 6, 7, 5, 9, 0, 1, 2, 6, 0};
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    private static void sort(int[] values) {
        for (int i = 1; i < values.length; ++i) {
            int value = values[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (values[j] > value) {
                    values[j + 1] = values[j];
                } else break;
            }

            values[j + 1] = value;
        }
    }
}
