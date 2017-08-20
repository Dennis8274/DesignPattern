package org.xufeng.deng.algorithms.leetcode;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by deng.xufeng(一乐) on 2017/7/25.
 * <p> algorithms 3  求最长子串，子串中不允许有重复字符
 *
 * @author deng.xufeng
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcbcaierodldgldg";
        int result = getLengthOfLongestSubstring(str);
        System.out.println(result);
    }

    private static int getLengthOfLongestSubstring(String str){
        if (str.length() == 0) return 0;

        int max = 0;
        Map<Character,Integer> map = Maps.newHashMap();
        for (int i=0,j=0;i<str.length();++i){
            if (map.containsKey(str.charAt(i))){
                j = Math.max(j,map.get(str.charAt(i))+1);
            }

            map.put(str.charAt(i),i);
            max = Math.max(max,i-j+1);
        }

        return max;
    }
}
