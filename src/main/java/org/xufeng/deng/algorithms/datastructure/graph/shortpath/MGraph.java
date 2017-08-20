package org.xufeng.deng.algorithms.datastructure.graph.shortpath;

/**
 * Created by deng.xufeng(一乐) on 2017/5/25.
 * <p>带权有向图
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class MGraph {

    private int vexNum;
    private int arcNum;
    private Integer[][] arcs = {
            {Integer.MAX_VALUE,Integer.MAX_VALUE,10,Integer.MAX_VALUE,30,100},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,5,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,50,Integer.MAX_VALUE,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,10},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,20,Integer.MAX_VALUE,60},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}
    };

    public int getVexNum() {
        return vexNum;
    }

    public void setVexNum(int vexNum) {
        this.vexNum = vexNum;
    }

    public int getArcNum() {
        return arcNum;
    }

    public void setArcNum(int arcNum) {
        this.arcNum = arcNum;
    }

    public Integer[][] getArcs() {
        return arcs;
    }

    public void setArcs(Integer[][] arcs) {
        this.arcs = arcs;
    }

    public MGraph(int vexNum, int arcNum) {
        this.vexNum = vexNum;
        this.arcNum = arcNum;
    }

    public static void main(String[] args){

    }
}
