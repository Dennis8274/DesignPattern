package org.xufeng.deng.algorithms;

/**
 * Created by xufeng.deng on 16/10/10.
 */
@SuppressWarnings("unused")
public class BruteMatching {
    public static void main(String[] args) {
//        //test PM
//        String T = "I am Dennis";
//        String P = "Dennis";
//        long st = System.currentTimeMillis();
//        int index = PM(T, P);
//        long end = System.currentTimeMillis();
//        System.out.println("index: " + index + " and time is " + (end - st) + " millis");

        //test buildNext
//        String P = "0000010";
////        int[] next = buildNext(P);
//        int[] next = buildNextImproved(P);
//        System.out.println(Arrays.toString(next));

        //kmp
//        String T = "0101000011100000010";
//        String P = "0000010";
//        int index = KMP(T, P);
//        System.out.println("index: "+index);


        //Test buildGS
        String T = "HERE IS A SIMPLE EXAMPLE";
//        System.out.println("T.length()="+T.length());
        String P = "EXAMPLE";
//        System.out.println("P.length()="+P.length());
//        int[] GS = buildGS(P);
//        System.out.println(Arrays.toString(GS));

        //test BMByBCAndGS
        int index = BMByBCAndGS(T, P);
        System.out.println("BMBYBCAndGS index: " + index);
    }

    /**
     * 暴力匹配
     *
     * @param T 主串
     * @param P 模式串
     * @return 匹配索引
     */
    public static int PM(String T, String P) {
        int i; //模式串相对于主串的起始位置
        int j; //模式串当前字符位置

        for (i = 0; i < T.length() - P.length(); ++i) {
            for (j = 0; j < P.length(); ++j) {
                if (T.charAt(i + j) != P.charAt(j)) break; //失配,模式串P向右挪
            }
            if (j > P.length()) break; //找到模式串在主串中的位置
        }
        return i;
    }

    /**
     * kmp匹配算法
     *
     * @param T 主串
     * @param P 模式串
     * @return 匹配索引
     */
    public static int KMP(String T, String P) {
        int i = 0; //主串指针
        int j = 0; //模式串指针

        //构建next[]
        int[] next = buildNextImproved(P);

        while (j < P.length() && i < T.length()) { //自左向右挨个比较,模式串P还在主串T的范围内
            if (0 > j || T.charAt(i) == P.charAt(j)) { //当前对匹配,或者模式串移的过度了
                //下一位
                ++i;
                ++j;
            } else {
                j = next[j]; //模式串右移
            }
        } //while end
        return (i - j);
    }

    /**
     * 构建next[]
     *
     * @param P 模式串
     * @return next[]数组
     */
    public static int[] buildNext(String P) { //建立模式串P的next[]
        int[] next = new int[P.length()];

        int j = 0;
        int t = next[0] = -1;

        while (j < P.length() - 1) {
            if (0 > t || P.charAt(j) == P.charAt(t)) {
                ++j;
                ++t;
                next[j] = t; //可以改进的地方
            } else {
                t = next[t]; //右移模式串
            }
        }
        return next;
    }

    /**
     * 构建next[]的改进
     *
     * @param P 模式串
     * @return next[] 改进版
     */
    private static int[] buildNextImproved(String P) { //构建next[]的改进方案
        int[] next = new int[P.length()];

        int j = 0;
        int t = next[0] = -1;

        while (j < P.length() - 1) {
            if (0 > t || P.charAt(j) == P.charAt(t)) {
                ++j;
                ++t;
                next[j] = (P.charAt(j) != P.charAt(t)) ? t : next[t]; //改进next[]
            } else {
                t = next[t];
            }
        }

        return next;
    }

    /**
     * 构建坏字符规则辅助数组BC[]
     *
     * @param P 模式串
     * @return BC[]
     */
    private static int[] buildBC(String P) {
        final int ALPHABET_SIZE = 256;
        int[] BC = new int[ALPHABET_SIZE];

        for (int i = 0; i < BC.length; ++i) {
            BC[i] = P.length(); //BC[i] = -1; 另外一种构建方法
        }

        for (int i = 0; i < P.length() - 1; ++i) {
            BC[P.charAt(i)] = P.length() - 1 - i; //|P| - indexOf(BC) 即模式串中与BC比较字符的位置 - 模式串中上一次出现BC的位置，后移位数 = 坏字符的位置 - 搜索词中的上一次出现位置
        }

        return BC;
    }

    /**
     * 构建好后缀规则辅助数组GS[]
     *
     * @param P 模式串
     * @return GS[]
     */
    private static int[] buildGS(String P) {
        int[] GS = new int[P.length()];
        int lastPrefixPosition = P.length();

        for (int i = P.length() - 1; i >= 0; --i) {
            if (isPrefix(P, i + 1)) {
                lastPrefixPosition = i + 1;
            }
            //P中无好后缀,找到最大前缀,前半边匹配，后半边不匹配
            GS[P.length() - 1 - i] = lastPrefixPosition - i + P.length() - 1; //在BM中因为i要参与移动,所有会有lastPrefixPosition
//            GS[P.length() - 1 - i] = i-lastPrefixPosition - i + P.length() - 1;
        }
        for (int i = 0; i < P.length() - 1; ++i) {
//            if (isSuffix(P, i + 1)) {
////                lastPrefixPosition = i+1;
//                lastSuffixLen = suffixLength(P, i);
//            }
//
//            GS[P.length() - 1 - i] = i - lastSuffixLen - 1;

            int slen = suffixLength(P, i); //这就是后半边匹配，前半边不匹配的情况
            GS[slen] = P.length() - 1 - i + slen; //同理，后移位数 = 好后缀的位置 - 搜索词中的上一次出现位置
//            GS[P.length()-i-1] = P.length() - 1 - i;
        }
        return GS;

    }

    public static boolean isSuffix(String P, int index) {
        for (int i = index, j = P.length() - 1; i >= 0; --i, --j) {
            if (P.charAt(i) != P.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    /**
     * p点的好后缀是否是前缀
     *
     * @param P 模式串
     * @param p 点
     * @return boolean 前缀?
     */
    private static boolean isPrefix(String P, int p) {
        for (int i = p, j = 0; i < P.length(); ++i, ++j) {
            if (P.charAt(i) != P.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * p点的最大好后缀长度
     *
     * @param P 模式串
     * @param p 点
     * @return int 好后缀长度
     */
    private static int suffixLength(String P, int p) {
        int len = 0;
        for (int i = p, j = P.length() - 1; i >= 0 && P.charAt(i) == P.charAt(j); --i, --j) {
            len += 1;
        }
        return len;
    }

    /**
     * 好后缀 坏字符结合BM匹配算法
     *
     * @param T 主串
     * @param P 模式串
     * @return 模式串在主串中的index
     */
    public static int BMByBCAndGS(String T, String P) {
        int index = -1;

        //preprocessing 预处理
        int[] GS = buildGS(P);
        int[] BC = buildBC(P);

        for (int i = 0, j; i < T.length() - 1; ++i) {
            for (j = P.length() - 1;i >= 0 && P.charAt(j) == T.charAt(i) ; --i, --j) {
                if (j == 0) {
                    return i;
                }
            }
            // i += needle.length - j;
            i += Math.max(GS[P.length() - 1 - j], BC[T.charAt(i)]);
        }
        return index;
    }
}
