package org.xufeng.deng.algorithms.datastructure.searchtable;

/**
 * Created by deng.xufeng(一乐) on 2017/6/7.
 * <p>静态查找表
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class StaticSearchTable {
    private static String[] elems = {"", "A", "B", "C", "D", "E", "F", "G", "H", "I"};
    private static float[] weights = {0, 1, 1, 2, 5, 3, 4, 4, 3, 5};
    private static float[] sw = new float[elems.length];

    /**
     * 由有序表elems及其累计权值表sw其中sw[0]=0递归构造次优查找树T
     */
    private void secondOptimal(BiTree T, String[] elems, float[] sw, int low, int high) {
        int i = low;
        float min = Math.abs(sw[high] - sw[low]);
        float dw = sw[high] + sw[low - 1];
        for (int j = low + 1; j <= high; ++j) { //选择最小的dlta pi值
            if (Math.abs(dw - sw[j] - sw[j - 1]) < min) {
                i = j;
                min = Math.abs(dw - sw[j] - sw[j - 1]);
            }
        }

        T.setData(elems[i]);//生成结点
        if (i == low) {
            T.setlChild(null);
        } else {
            secondOptimal(T.getlChild(), elems, sw, low, i - 1);
        }

        if (i == high) {
            T.setrChild(null);
        } else {
            secondOptimal(T.getrChild(), elems, sw, i + 1, high);
        }
    }

    private void buildNOPT(BiTree T) {
        buildSW(weights);
        secondOptimal(T, elems, sw, 1, elems.length - 1);
    }

    private float[] buildSW(float[] weights) {
        sw[0] = weights[0];
        for (int i = 1; i < weights.length; ++i) {
            sw[i] = sw[i - 1] + weights[i];
        }

        return sw;
    }

    public static void main(String[] args) {
        StaticSearchTable searchTable = new StaticSearchTable();
        BiTree T = new BiTree();
        searchTable.buildNOPT(T);
    }
}
