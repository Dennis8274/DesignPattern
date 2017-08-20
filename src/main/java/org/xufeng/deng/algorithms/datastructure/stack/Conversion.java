package org.xufeng.deng.algorithms.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by deng.xufeng(一乐) on 2017/5/9.
 * <p>十进制与d进制数转换
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class Conversion {

    public static void conversion(int d) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入转换的十进制数：");
        int N = scanner.nextInt();
        while (N != 0) {
            stack.push(N % d);
            N = N / d;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        conversion(2);
    }

}
