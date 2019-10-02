package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * <p>堆排序 不稳定  小根堆、大根堆--原理大同小异 顺序表
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class HeapSort {
    private static final int[] values = {7, 6, 5, 4, 3, 2, 1, 0, 10, 9, 8, 0, 2, 4, 6, 8};

    public static void main(String[] args) {
        sort();
    }

    private static void sort() {
        buildHeap();
        int k = values.length - 1;
        while (k > 0) {
            swap(0, k);
            siftDown(0, values[0], values, k);
            --k;
        }

        System.out.println(Arrays.toString(values));
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

    private static void buildHeap() {
        int size = values.length;
        int half = (size >>> 1) - 1; // equals to ((size - 2) >>> 1)
        for (int i = half; i >= 0; --i) {
            siftDown(i, values[i], values, size);
        }
    }

    private static void siftDown(int k, int value, int[] arr, int n) { // 在以k为root的子堆中，插入value，子堆中所有孩子的索引小于n
        if (n > 0) {
            int half = n >>> 1;
            while (k < half) {
                int child = (k << 1) + 1;
                int right = child + 1;
                if (right < n && arr[child] < arr[right]) child = right;
                if (arr[child] <= value) break;

                arr[k] = arr[child];
                k = child;
            }

            arr[k] = value;
        }
    }

    private static void siftUp(int k, int value, int[] arr) {
        int n = arr.length;
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            if (arr[parent] >= value) break;

            arr[k] = arr[parent];
            k = parent;
        }

        arr[k] = value;
    }

}

