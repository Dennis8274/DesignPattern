package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/9/25
 */
public class QuickSort2 {

    private static final int[] values = {7, 2, 4, 3, 0, 8, 9, 2, 1, 0};

    public static void main(String[] args) {
        sort(0, values.length - 1, values);
        System.out.println(Arrays.toString(values));
    }

    private static void sort(int low, int high, int[] values) {
        if (high <= low) return;
        int pivotIndex = partition(low, high, values);
        sort(low, pivotIndex - 1, values);
        sort(pivotIndex + 1, high, values);
    }

    private static int partition(int low, int high, int[] values) {
        int pivot = values[high];
        int i = low, j = low;
        while (j <= high) {
            if (values[j] < pivot) {
                swap(i++, j);
            }
            ++j;
        }

        swap(i, high);

        return i;
    }

    private static void swap(int i, int j) {
        int n = values[i];
        int m = values[j];
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        values[i] = n;
        values[j] = m;
    }
}
