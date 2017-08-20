package org.xufeng.deng.algorithms.datastructure.graph.spanningtree;

/**
 * Created by deng.xufeng(一乐) on 2017/5/23.
 * <p>
 *
 * @author deng.xufeng
 */
public class Vex<E> {
    private E data;
    private Arc<E> firstArc;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Arc<E> getFirstArc() {
        return firstArc;
    }

    public void setFirstArc(Arc<E> firstArc) {
        this.firstArc = firstArc;
    }

    public Vex(E data, Arc<E> firstArc) {
        this.data = data;
        this.firstArc = firstArc;
    }

    public String toString() {
        return "Vex{" +
                "data=" + data +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vex<?> vex = (Vex<?>) o;

        return data.equals(vex.data);
    }

    public int hashCode() {
        return data.hashCode();
    }
}
