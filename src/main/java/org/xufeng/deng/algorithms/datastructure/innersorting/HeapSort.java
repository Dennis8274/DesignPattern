package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * Created by deng.xufeng(一乐) on 2017/6/2.
 * <p>堆排序 不稳定  小根堆、大根堆--原理大同小异 顺序表
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class HeapSort {

    private static Integer[] values = {0, 49, 38, 65, 97, 76, 13, 27, 49};//总想对索引为0的这个位置说点什么

    private static void heapAdjust(Integer[] values, int s, int m) {
        int rc = values[s]; //parentNode
        for (int j = 2 * s; j <= m; j *= 2) {
            if (j < m && values[j] < values[j + 1]) {//找到较大的记录values[j] 从节点s往下找子节点
                ++j;
            }
            if (rc >= values[j]) {
                break;
            }
            values[s] = values[j];
            s = j;
        }
        values[s] = rc;
    }

    private static void heapSort(Integer[] values) {
        for (int i = values.length / 2; i > 0; --i) {
            heapAdjust(values, i, values.length - 1);
        }
        for (int i = values.length - 1; i > 1; --i) {
            values[1] = (values[1] ^ values[i]) ^ (values[i] ^= (values[1] ^ values[i]));
            heapAdjust(values, 1, i - 1);
        }
    }

    public static void main(String[] args) {
        heapSort(values);
        System.out.println(Arrays.deepToString(values));
    }
}
