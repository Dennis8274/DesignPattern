package org.xufeng.deng.algorithms.datastructure.stack.recursion.hanoi;

/**
 * Created by deng.xufeng(一乐) on 2017/5/12.
 * <p>3阶hanoi问题递归实现
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class HanoiRecursivelyImpl {
    public static void main(String[] args) {
        int n = 3;
        hanoi(n, "x", "y", "z");
    }

    private static void hanoi(int n, String x, String y, String z) {
        if (n == 1) {
            move(x, 1, z);
        } else {
            hanoi(n - 1, x, z, y);
            move(x, n, z);
            hanoi(n - 1, y, x, z);
        }
    }

    private static void move(String source, int n, String destination) {
        System.out.println(source + "-" + n + "-》" + destination);
    }
}
