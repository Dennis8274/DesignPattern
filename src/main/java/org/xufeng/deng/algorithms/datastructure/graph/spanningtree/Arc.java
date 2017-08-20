package org.xufeng.deng.algorithms.datastructure.graph.spanningtree;

/**
 * Created by deng.xufeng(一乐) on 2017/5/23.
 * <p>
 *
 * @author deng.xufeng
 */
public class Arc<E> {
    private int weight;
    private Vex<E> conVex;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vex<E> getConVex() {
        return conVex;
    }

    public void setConVex(Vex<E> conVex) {
        this.conVex = conVex;
    }

    public Arc(int weight, Vex<E> conVex) {
        this.weight = weight;
        this.conVex = conVex;
    }
}
