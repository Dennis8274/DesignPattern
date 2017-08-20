package org.xufeng.deng.algorithms.datastructure.innersorting;

import java.util.Arrays;

/**
 * Created by deng.xufeng(一乐) on 2017/6/2.
 * <p>选择排序--简单选择排序 不稳定 O(n2)
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class SimpleSelectionSort {
    private static Integer[] values = {2, 4, 5, 2, 7, 9, 10, 3, 6, 8, 11};

    public static void main(String[] args){
        for (int i=0;i<values.length;++i){
            int minIndex = i;
            Integer min = Integer.MAX_VALUE;
            for (int j=i;j<values.length;++j){
                if (min.compareTo(values[j])>0){
                    min = values[j];
                    minIndex = j;
                }
            }

            if (i!=minIndex){
                values[i] =(values[i]^values[minIndex])^(values[minIndex]^=(values[i]^values[minIndex]));
            }
        }

        System.out.println(Arrays.deepToString(values));
    }
}
