package org.xufeng.deng.algorithms.leetcode;

/**
 * Created by deng.xufeng(一乐) on 2017/8/13.
 * <p>Problem 6 详情参看具体题目:以S型依次拼接
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "ASDOGJFKVHCKSMFKG";
        int rows = 5;
        System.out.println(convert(s,rows));
    }

    private static String convert(String s, int rows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[rows];
        for (int i = 0; i < sb.length; i++){
            sb[i] = new StringBuffer();
        }

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < rows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = rows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
}
