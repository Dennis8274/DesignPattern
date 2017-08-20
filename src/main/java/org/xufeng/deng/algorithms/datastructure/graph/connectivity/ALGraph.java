package org.xufeng.deng.algorithms.datastructure.graph.connectivity;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/5/24.
 * <p>有向图
 *
 * @author deng.xufeng
 */
public class ALGraph {
    private int vexNum;
    private int arcNum;
    private List<ALVex<String>> vexs;
    private int[] inDegree;

    public int[] getInDegree() {
        return inDegree;
    }

    public void setInDegree(int[] inDegree) {
        this.inDegree = inDegree;
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

    public List<ALVex<String>> getVexs() {
        return vexs;
    }

    public void setVexs(List<ALVex<String>> vexs) {
        this.vexs = vexs;
    }

    public ALGraph(int vexNum, int arcNum) {
        this.vexNum = vexNum;
        this.arcNum = arcNum;
    }
}
