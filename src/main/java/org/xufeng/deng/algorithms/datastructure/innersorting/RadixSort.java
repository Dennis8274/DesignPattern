package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * Created by deng.xufeng(一乐) on 2017/6/4.
 * <p>基数排序
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class RadixSort {

    private static int rowNum = 10;

    private static void radixSort(Integer[] values, int d) {
        int[][] tmpQueue = new int[rowNum][values.length + 1];
        for (int i = 0; i < rowNum; ++i) {
            tmpQueue[i][0] = 0;//队列链表初始化,记录第i行数据的个数
        }

        for (int pos = 1; pos <= d; ++pos) {
            //分配
            for (Integer value : values) {
                int row = getNumInPos(value, pos);
                int col = ++tmpQueue[row][0];
                tmpQueue[row][col] = value;
            }
            //收集
            for (int row = 0, index = 0; row < rowNum; ++row) {
                for (int col = 1; col <= tmpQueue[row][0]; ++col) {
                    values[index++] = tmpQueue[row][col];
                }
                //复位 方便下次分配
                tmpQueue[row][0] = 0;
            }
        }
    }

    //pos=1表示个位，pos=2表示十位
    private static int getNumInPos(int num, int pos) {
        int tmp = 1;
        for (int i = 0; i < pos - 1; i++) {
            tmp *= 10;
        }
        return (num / tmp) % 10;
    }

    //求得最大位数d
    private static int getMaxDigit(Integer[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max)
                max = value;
        }
        int tmp = 1, d = 1;
        while (true) {
            tmp *= 10;
            if (max / tmp != 0) {
                d++;
            } else
                break;
        }
        return d;
    }


    public static void main(String[] args) {
        Integer[] values = { 49, 38, 65, 197, 76, 213, 27, 50 };
        radixSort(values, getMaxDigit(values));
        System.out.println(Arrays.deepToString(values));
    }
}
