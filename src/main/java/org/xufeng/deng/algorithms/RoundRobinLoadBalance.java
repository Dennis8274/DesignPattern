package org.xufeng.deng.algorithms;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/10/8
 */
public class RoundRobinLoadBalance {

    private static RobinBucket[] buckets;

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        buckets = build(values);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
        System.out.println(select(buckets).weight);
    }

    private static RobinBucket select(RobinBucket[] buckets) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        RobinBucket selected = null;
        for (RobinBucket bucket : buckets) {
            total += bucket.weight;
            int current = bucket.increase();
            if (current > max) {
                max = current;
                selected = bucket;
            }
        }

        if (selected != null) {
            selected.setCurrent(-total);
        }

        return selected;
    }

    private static RobinBucket[] build(int[] values) {
        RobinBucket[] buckets = new RobinBucket[values.length];
        for (int i = 0; i < values.length; ++i) {
            buckets[i] = new RobinBucket(values[i]);
        }
        return buckets;
    }

    static class RobinBucket {
        private final int weight;
        private int current;

        RobinBucket(int weight) {
            this.weight = weight;
        }

        public int increase() {
            current += weight;
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }
    }
}
