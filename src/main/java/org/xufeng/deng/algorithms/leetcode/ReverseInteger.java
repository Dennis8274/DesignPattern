package org.xufeng.deng.algorithms.leetcode;

/**
 * Created by deng.xufeng(一乐) on 2017/8/16.
 * <p>给一个整数(int 32位) Problem 7
 *
 * @author deng.xufeng
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    private static int reverse(int value) {
        int result = 0;
        while (value != 0) {
            int tail = value % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }

            result = newResult;
            value = value/10;
        }
        return result;
    }
}
