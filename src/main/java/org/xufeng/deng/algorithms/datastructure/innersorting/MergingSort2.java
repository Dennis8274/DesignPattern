package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/9/25
 */
public class MergingSort2 {
    private static final int[] values = {7, 2, 4, 3, 0, 8, 9, 2, 1, 0};

    public static void main(String[] args) {
        sort(0, values.length - 1, values);
        System.out.println(Arrays.toString(values));
    }

    private static void sort(int l, int r, int[] values) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        sort(l, mid, values);
        sort(mid + 1, r, values);
        // merge
        merge(l, mid, r, values);
    }

    private static void merge(int l, int mid, int r, int[] values) {
        int len = r - l + 1;
        int[] tmp = new int[len];
        int start = 0;

        int left = l;
        int right = mid + 1;
        while (left <= mid && right <= r) {
            if (values[left] <= values[right]) {
                tmp[start++] = values[left++];
            } else {
                tmp[start++] = values[right++];
            }
        }

        while (left <= mid) tmp[start++] = values[left++];
        while (right <= r) tmp[start++] = values[right++];

        start = 0;
        int index = l;
        while (index <= r) values[index++] = tmp[start++];

    }

}
