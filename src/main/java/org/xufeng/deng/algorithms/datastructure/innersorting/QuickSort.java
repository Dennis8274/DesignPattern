package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * <p>快速排序 平均时间：knlnn，被认为是最好的内部排序方法  稳定
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class QuickSort {

    private static Integer[] values = {49, 38, 65, 97, 76, 13, 27, 49};

    private static int Partition(Integer[] values, int low, int high) {
        int pivotKey = values[low];//枢轴
        while (low < high) {
            while (low < high && values[high] >= pivotKey) {
                --high;
            }
            //两值交换：x = (x^y)^(y^=(x^y));
            //low<->high
            //每交换一对记录需进行3此记录移动的操作。实际上，对枢轴的复制是多余的，所以可以这样代替以下表达式：
            //values[low] = values[high];
            values[low] = (values[low] ^ values[high]) ^ (values[high] ^= (values[low] ^ values[high]));
            while (low < high && values[low] < pivotKey) {
                ++low;
            }
            //同理
            //values[high] = values[low];
            values[low] = (values[low] ^ values[high]) ^ (values[high] ^= (values[low] ^ values[high]));
        }

        return low;
    }

    private static void QSort(Integer[] values, int low, int high) {
        if (low < high) {
            int pivotLoc = Partition(values, low, high);
            QSort(values, low, pivotLoc - 1);
            QSort(values, pivotLoc + 1, high);
        }
    }

    public static void main(String[] args) {
        QSort(values, 0, values.length - 1);
        System.out.println(Arrays.deepToString(values));
    }
}
