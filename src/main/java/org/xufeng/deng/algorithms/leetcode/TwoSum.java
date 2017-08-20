package org.xufeng.deng.algorithms.leetcode;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by deng.xufeng(一乐) on 2017/7/25.
 * <p> algorithms 1 存在一个整数数组，给一个数target,求得在数组中两数相加得target两个数的索引
 *
 * @author deng.xufeng
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] values = {1,3,5,7,10};
        int target = 11;
        int[] result = getResult(values,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getResult(int[] values, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> reverseMap = Maps.newHashMap();
        for (int i = 0; i < values.length; ++i) {
            if (reverseMap.containsKey(target - values[i])){
                result[0] = i+1;
                result[1] = reverseMap.get(target - values[i]);
                return result;
            }

            reverseMap.put(values[i],i+1);
        }

        return result;
    }
}

