package org.xufeng.deng.algorithms.datastructure.graph.connectivity;

/**
 * Created by deng.xufeng(一乐) on 2017/5/23.
 * <p>有向图弧（关系）
 *
 * @author deng.xufeng
 */
public class ALArc<E> {
    private int weight;
    private ALVex<E> conVex;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ALVex<E> getConVex() {
        return conVex;
    }

    public void setConVex(ALVex<E> conVex) {
        this.conVex = conVex;
    }

    public ALArc(ALVex<E> conVex) {
        this.conVex = conVex;
    }

    public ALArc(int weight, ALVex<E> conVex) {
        this.weight = weight;
        this.conVex = conVex;
    }
}
