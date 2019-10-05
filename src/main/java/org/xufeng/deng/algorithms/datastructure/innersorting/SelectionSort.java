package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/4
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] values = {2, 4, 6, 5, 3, 1, 8, 9, 0, 5, 4, 2, 6, 8, 1, 0, 2, 1, 7, 6, 9};
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int selection = arr[arr.length - 1];
            int index = arr.length - 1;
            for (int j = arr.length - 1; j >= i; --j) {
                if (selection > arr[j]) {
                    selection = arr[j];
                    index = j;
                }
            }
            swap(i, index, arr);
        }
    }

    private static void swap(int i, int j, int[] values) {
        int tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }
}
