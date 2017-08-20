package org.xufeng.deng.algorithms.datastructure.graph.spanningtree;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/5/23.
 * <p>采用邻接表存储结构的无向图
 *
 * @author deng.xufeng
 */
public class UGraph {
    private int vexNum;
    private int arcNum;
    private List<Vex<String>> vexs;

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

    public List<Vex<String>> getVexs() {
        return vexs;
    }

    public void setVexs(List<Vex<String>> vexs) {
        this.vexs = vexs;
    }

    public UGraph(int vexNum, int arcNum) {
        this.vexNum = vexNum;
        this.arcNum = arcNum;
    }
}
