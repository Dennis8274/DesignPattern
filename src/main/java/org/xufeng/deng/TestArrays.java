package org.xufeng.deng;

import java.util.Arrays;

/**
 * @des  测试Arrays类
 * @author xufeng.deng
 * @date 16/9/29 下午3:23
 * @classname TestArrays
 */
public class TestArrays {
    private static String[][] strs1 = {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
    };
    private static String[][] strs2 = {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
    };
    public static void main(String[] args){
        int hashCode = Arrays.hashCode(strs1);
        int deepHashCode = Arrays.deepHashCode(strs1);
        String str = Arrays.deepToString(strs1);
        System.out.println("deepToString:"+str);
        System.out.println("toString:"+strs1.toString());
        System.out.println("hashCode:"+hashCode);
        System.out.println("deepHashCode:"+deepHashCode);
    }
}
