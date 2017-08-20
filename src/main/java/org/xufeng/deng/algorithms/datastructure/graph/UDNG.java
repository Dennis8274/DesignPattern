package org.xufeng.deng.algorithms.datastructure.graph;

/**
 * Created by deng.xufeng(一乐) on 2017/5/21.
 * <p>数组表示法表示的无向网
 *
 * @author deng.xufeng
 */
public class UDNG {
    private String[] vexs;
    private Integer[][] arcs;
    private int vexNum;
    private int arcNum;

    public UDNG(int vexNum, int arcNum) {
        this.vexNum = vexNum;
        this.arcNum = arcNum;
        vexs = new String[vexNum];
        arcs = new Integer[vexNum][vexNum];
    }

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

    public String[] getVexs() {
        return vexs;
    }

    public void setVexs(String[] vexs) {
        this.vexs = vexs;
    }

    public Integer[][] getArcs() {
        return arcs;
    }

    public void setArcs(Integer[][] arcs) {
        this.arcs = arcs;
    }
}
