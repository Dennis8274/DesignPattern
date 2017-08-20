package org.xufeng.deng.algorithms;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/4/11.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class TopN {

    private static List<List<Integer>> arr = Lists.newArrayList();

    private static List<Integer> arr1 = Lists.newArrayList();
    private static List<Integer> arr2 = Lists.newArrayList();

    private static Integer BIG_VALUE = 101;
    private static Integer LESS_VALUE = 102;

    public static void main(String[] args) {
//        //归并法
//        initArr();
//        int k = 4;
//        System.out.println(getTopNByMerge(arr, k));
//
//        //快排法
//        int[] quickSortArr = {2, 9, 0, 4, 7, 1, 0, 6};
//        List<Integer> result = getTopNByQKSort(quickSortArr, EXPECT_NUM);
//        System.out.println(result);

        //根堆法
        int[] heap = {2, 3, 6, 9, 1, 0, 3, 8, 4};
        int[] resultOfHeap = getTopNByHeap(heap, EXPECT_NUM);
        System.out.println(Arrays.toString(resultOfHeap));

    }

    /**
     * 初始化数组
     */
    private static void initArr() {
        //for arr1
        arr1.add(7);
        arr1.add(3);
        arr1.add(2);
        arr1.add(1);
        arr.add(arr1);

        //for arr2
        arr2.add(9);
        arr2.add(7);
        arr2.add(5);
        arr2.add(4);
        arr2.add(2);
        arr.add(arr2);
    }

    /**
     * 已知几个递减有序的数组，求k个最大的值<>
     * <p>有几个重要的点：
     * 1.数组是递减的；
     * 2.每次从m个数组中提取当前最大值；
     * 3.接2步，记录当前最大值的在当前数组中的索引，下一轮加1。
     *
     */
    private static List<Integer> getTopNByMerge(List<List<Integer>> arr, int k) {
        int[] index = new int[arr.size()];
        List<Integer> result = Lists.newArrayList();
        for (int i = 0; i < k; ++i) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < arr.size(); ++j) {
                if (index[j] < arr.get(j).size()) {
                    if (max < arr.get(j).get(index[j])) {
                        max = arr.get(j).get(index[j]);
                        maxIndex = j;
                    }
                }
            }
            result.add(max);
            index[maxIndex] += 1;
        }
        return result;
    }

    private static int QKSortPart(final int[] arr, int first, int end) {
        int i = first;
        int main = arr[end];//以此为基准
        for (int j = first; j < end; ++j) {
            if (arr[j] < main) {
                arr[i] = (arr[i] ^ arr[j]) ^ (arr[j] ^= (arr[i] ^ arr[j]));
                ++i;
            }
        }
        arr[end] = arr[i];
        arr[i] = main;
        return i;
    }

    private static void getTopNBySort(final int[] arr, int first, int end, int n) {
        if (first < end) {
            int partIndex = QKSortPart(arr, first, end);
            if (partIndex == n - 1) {
            } else if (partIndex > n - 1) getTopNBySort(arr, first, partIndex - 1, n);
            else getTopNBySort(arr, partIndex + 1, end, n);
        }
    }

    private static final Integer EXPECT_NUM = 3;

    /**
     * <p>采用快排法取n个最小值,就是快速排序算法
     */
    private static List<Integer> getTopNByQKSort(final int[] arr, int expectNum) {
        List<Integer> result = Lists.newArrayList();
        getTopNBySort(arr, 0, arr.length - 1, expectNum);
        int[] resultArr = new int[expectNum];
        System.arraycopy(arr, 0, resultArr, 0, expectNum);
        Arrays.sort(resultArr);
        for (int aResultArr : resultArr) {
            result.add(aResultArr);
        }
        return result;
    }


    /**
     * <p>采用小根堆求最大的N个值，用大根堆求N个最小值，适用于数据量大的场景
     */
    private static int[] getTopNByHeap(int[] arr, int k) {
        int[] heap = createHeap(arr, k);
        for (int value : arr) {
            if (value > heap[0]) {
                insert(heap, value);
            }
        }
        return heap;
    }

    private static void insert(int[] heap, int value) {
        int parent = 0;
        heap[0] = value;
        while (parent < heap.length) {
            int rChildIndex = 2 * parent + 1;
            int lChildIndex = 2 * parent + 2;
            int minValueIndex = parent;
            if (lChildIndex < heap.length && heap[lChildIndex] < heap[parent]) {
                minValueIndex = lChildIndex;
            }
            if (rChildIndex < heap.length && heap[rChildIndex] < heap[minValueIndex]) {
                minValueIndex = rChildIndex;
            }

            if (minValueIndex == parent) {
                break;
            } else {
                heap[parent] = (heap[parent] ^ heap[minValueIndex]) ^ (heap[minValueIndex] ^= (heap[minValueIndex] ^ heap[parent]));
                parent = minValueIndex;
            }
        }
    }

    /**
     * 创建大小为k的小根堆（小OR大）
     */
    private static int[] createHeap(int[] arr, int k) {
        int[] heap = new int[k];
        //初始化
        for (int i = 0; i < k; ++k) {
            heap[i] = arr[i];
        }
        for (int i = 1; i < k; ++i) {
            int childIndex = i;
            int parentIndex = (childIndex - 1) / 2;
            int currentValue = arr[i];
            while (parentIndex >= 0 && childIndex != 0 && arr[childIndex] > currentValue) {
                arr[childIndex] = arr[parentIndex];
                childIndex = parentIndex;
                parentIndex = (parentIndex - 1) / 2;
            }
            arr[parentIndex] = currentValue;
        }
        return heap;
    }
}
