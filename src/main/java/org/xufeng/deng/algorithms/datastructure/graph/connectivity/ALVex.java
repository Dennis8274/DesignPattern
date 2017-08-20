package org.xufeng.deng.algorithms.datastructure.graph.connectivity;

/**
 * Created by deng.xufeng(一乐) on 2017/5/24.
 * <p>有向图顶点
 *
 * @author deng.xufeng
 */
public class ALVex<E> {
    private E data;
    private ALArc<E> firstArc;
    private int inDegree;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public ALArc<E> getFirstArc() {
        return firstArc;
    }

    public void setFirstArc(ALArc<E> firstArc) {
        this.firstArc = firstArc;
    }

    public int getInDegree() {
        return inDegree;
    }

    public void setInDegree(int inDegree) {
        this.inDegree = inDegree;
    }

    public ALVex(E data, ALArc<E> firstArc) {
        this.data = data;
        this.firstArc = firstArc;
    }

    public String toString() {
        return "ALVex{" +
                "data=" + data +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ALVex<?> alVex = (ALVex<?>) o;

        return data != null ? data.equals(alVex.data) : alVex.data == null;
    }

    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}
