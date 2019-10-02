package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * Created by deng.xufeng(一乐) on 2017/6/4.
 * <p>归并排序 稳定 空间复杂度 O(n)
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class MergingSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27};
        MergeSort(a);

        System.out.println(Arrays.toString(a));
    }

    private static void MergeSort(int[] a) {
        Sort(a, 0, a.length - 1);
    }

    private static void Sort(int[] a, int left, int right) {
        if (left >= right)
            return;

        int mid = (left + right) / 2;
        //二路归并排序里面有两个Sort，多路归并排序里面写多个Sort就可以了
        Sort(a, left, mid);
        Sort(a, mid + 1, right);
        merge(a, left, mid, right);

    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[a.length];  // 这里可以优化一下
        int r1 = mid + 1;
        int tIndex = left;
        int cIndex = left;
        // 逐个归并
        while (left <= mid && r1 <= right) {
            if (a[left] <= a[r1])
                tmp[tIndex++] = a[left++];
            else
                tmp[tIndex++] = a[r1++];
        }
        // 将左边剩余的归并
        while (left <= mid) {
            tmp[tIndex++] = a[left++];
        }
        // 将右边剩余的归并
        while (r1 <= right) {
            tmp[tIndex++] = a[r1++];
        }


        while (cIndex <= right) {
            a[cIndex] = tmp[cIndex];
            cIndex++;
        }
    }
}
