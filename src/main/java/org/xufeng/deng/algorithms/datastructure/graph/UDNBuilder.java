package org.xufeng.deng.algorithms.datastructure.graph;

/**
 * Created by deng.xufeng(一乐) on 2017/5/21.
 * <p>采用数组（邻接矩阵）表示法，构造无向网G
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class UDNBuilder {

    private static String[] vexs = {"A","B","C","D","E","F"};

    private static Integer[][] arcs = {
            {Integer.MAX_VALUE,5,Integer.MAX_VALUE,7,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,4,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {8,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,9},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,5,Integer.MAX_VALUE,Integer.MAX_VALUE,6},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,5,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {3,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,Integer.MAX_VALUE}
    };

    public static String[] getVexs() {
        return vexs;
    }

    public static UDNG buildUDNG(){
        UDNG g = new UDNG(vexs.length,10);
        int i=0;
        while (i<g.getVexNum()) {
            g.getVexs()[i] = vexs[i];
            ++i;
        }
        //初始化
        for (int j=0;j<g.getVexNum();++j){
            for (int k=0;k<g.getVexNum();++k){
                g.getArcs()[j][k] = arcs[j][k];
                //无向图
//                g.getArcs()[k][j] = g.getArcs()[j][k];
            }
        }
        return g;
    }

    public static void main(String[] args){
        UDNG g = new UDNG(vexs.length,10);
        int i=0;
        while (i<g.getVexNum()) {
            g.getVexs()[i] = vexs[i];
            ++i;
        }
        //初始化
        for (int j=0;j<g.getVexNum();++j){
            for (int k=0;k<g.getVexNum();++k){
                g.getArcs()[j][k] = arcs[j][k];
                //无向图
//                g.getArcs()[k][j] = g.getArcs()[j][k];
            }
        }
        System.out.println(g);

    }
}
