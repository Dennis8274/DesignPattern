package org.xufeng.deng.algorithms.datastructure.graph.shortpath;

/**
 * Created by deng.xufeng(一乐) on 2017/5/26.
 * <p>带权有向图--Floyd算法求最短路径
 *
 * @author deng.xufeng
 */
public class FMGraph {
    private int vexNum;
    private int arcNum;
    private Integer[][] arcs = {
            {0,4,11},
            {6,0,2},
            {3,Integer.MAX_VALUE,0}
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

    public FMGraph(int vexNum, int arcNum) {
        this.vexNum = vexNum;
        this.arcNum = arcNum;
    }
}
