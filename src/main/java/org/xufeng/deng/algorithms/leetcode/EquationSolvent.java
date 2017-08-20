package org.xufeng.deng.algorithms.leetcode;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/7/25.
 * <p> 等式解决方案，algorithms 640
 *
 * @author deng.xufeng
 */
public class EquationSolvent {

    public static void main(String[] args) {
        String exp = "x+5-3+x=6+x-2";
        String result = solveEquation(exp);
        System.out.println(result);
    }


    /**
     * 实行左加右减
     */
    public static String solveEquation(String equation) {
        String[] exps = equation.split("=");
        int lhs = 0;
        int rhs = 0;

        //左
        for (String ch : getFactors(exps[0])) { // getFactors() == lr[0].split("(?=\\+)|(?=-)")
            if (ch.contains("x")) { // 含 x,对 x 作处理,lhs加法
                lhs += Integer.parseInt(solveCoefficient(ch));
            } else { //将左边的数移到右边，即对rhs操作减法
                rhs -= Integer.parseInt(ch);
            }
        }

        // 右
        for (String ch : getFactors(exps[1])) {
            if (ch.contains("x")) { //含 x ，对lhs 减法
                lhs -= Integer.parseInt(solveCoefficient(ch));
            } else { // 加法
                rhs += Integer.parseInt(ch);
            }
        }

        if (lhs == 0) {
            if (rhs == 0) {
                return "Infinite solution";
            } else {
                return "No solution";
            }
        }

        return "x=" + (rhs / lhs);
    }

    /**
     * 求解x的参数
     */
    private static String solveCoefficient(String x) {
        if (x.length() > 1 && x.charAt(x.length() - 2) >= '0' && x.charAt(x.length() - 2) <= '9') { //x有系数的情况
            return x.replace("x", "");
        }
        return x.replace("x", "1"); // 无系数的情况
    }

    /**
     * 取得每个加减数项
     */
    private static List<String> getFactors(String exp) {
        List<String> result = Lists.newArrayList();
        String x = "";
        for (int i = 0; i < exp.length(); ++i) {
            if ('+' == exp.charAt(i)
                    || '-' == exp.charAt(i)) {
                if (x.length() > 0) {
                    result.add(x);
                }
                x = "" + exp.charAt(i);
            } else {
                x += exp.charAt(i);
            }
        }

        result.add(x);

        return result;
    }
}
