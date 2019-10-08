package org.xufeng.deng.algorithms;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/8
 */
public class RandomLoadBalance {

    private static int[] values = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};

    public static void main(String[] args) {
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
        System.out.println(select(values));
    }

    private static int select(int[] values) {
        int firstWeight = values[0];

        int total = firstWeight;
        boolean sameWeight = true;
        for (int i = 1; i < values.length; ++i) {
            total += values[i];
            if (sameWeight && firstWeight != values[i]) {
                sameWeight = false;
            }
        }

        if (!sameWeight && total > 0) {
            int nextInt = ThreadLocalRandom.current().nextInt(total);
            for (int value : values) {
                nextInt -= value;
                if (nextInt < 0) return value;
            }
        }

        return values[ThreadLocalRandom.current().nextInt(values.length)];
    }

}
