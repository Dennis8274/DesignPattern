package org.xufeng.deng.algorithms.leetcode;

/**
 * Created by deng.xufeng(一乐) on 2017/8/13.
 * <p>Problem 5 最长回文子串
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class LongestPalindromicSubstring {
    private static int index;
    private static int maxSubstringLen;

    public static void main(String[] args) {
        String s = "1234567890098765423123";
        System.out.println(getLongestPalindrome(s));
    }

    private static String getLongestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }

        for (int i = 1; i < s.length() - 1; ++i) {
            extendsPalindrome(s, i, i); //odd
            extendsPalindrome(s, i, i + 1); //even
        }

        return s.substring(index, index + maxSubstringLen);
    }

    private static void extendsPalindrome(String s, int begin, int next) {
        while (begin >= 0 && next < s.length() && s.charAt(begin) == s.charAt(next)) {
            --begin;
            ++next;
        }

        if (maxSubstringLen < next - begin - 1) {
            index = begin + 1;
            maxSubstringLen = next - begin - 1;
        }
    }
}
