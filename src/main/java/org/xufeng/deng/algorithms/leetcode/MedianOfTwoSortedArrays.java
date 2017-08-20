package org.xufeng.deng.algorithms.leetcode;

/**
 * Created by deng.xufeng(一乐) on 2017/7/28.
 * <p> algorithms 4
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class MedianOfTwoSortedArrays {

    private static final int[] A = {1, 3, 5, 7, 9};
    private static final int[] B = {2, 4, 6, 8, 10, 12};

    public static void main(String[] args) throws Exception {
        System.out.println(getMedium(A,B));
    }

    private static double getMedium(int[] A, int[] B) throws Exception {
        int m = A.length;
        int n = B.length;
        int minIndex = 0;
        int maxIndex = m;

        if (m > n) { //保证n>m
            throw new Exception();
        }

        if (n == 0) {
            throw new Exception();
        }

        while (minIndex <= maxIndex) {
            int i = (minIndex + maxIndex) / 2;
            int j = (m + n + 1) / 2 - i;
            if (i > 0 && A[i - 1] > B[j]) { //理应i > 0 and j < n and A[i - 1] > B[j] 但是m <= n, i < m ==> j = (m+n+1)/2 - i > (m+n+1)/2 -m >= (2*m+1)/2
                // - m >= 0
                // i过大
                maxIndex = i - 1;
            } else if (i < m && B[j - 1] > A[i]) { //理应j > 0 and i < m and B[j - 1] > A[i] 但是 m <= n, i > 0 ==> j = (m+n+1)/2 - i < (m+n+1)/2 <= (2*n+1)/2 <= n
                // i过小
                minIndex = i + 1;
            } else {
                int maxOfLeft;
                int minOfRight;
                if (i == 0) {
                    maxOfLeft = B[j - 1];
                } else if (j == 0) {
                    maxOfLeft = A[i - 1];
                }else {
                    maxOfLeft = Math.max(A[i-1],B[j-1]);
                }

                if ((m+n)%2 == 1){
                    return (float) maxOfLeft;
                }

                if (i==m){
                    minOfRight = B[j];
                }else if (j==n){
                    minOfRight = A[i];
                }else {
                    minOfRight = Math.min(A[i],B[j]);
                }

                return (maxOfLeft+minOfRight)/2.0;
            }
        }
        return -1;
    }
}
