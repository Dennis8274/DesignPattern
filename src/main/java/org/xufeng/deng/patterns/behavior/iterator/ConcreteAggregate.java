package org.xufeng.deng.patterns.behavior.iterator;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list;

    public ConcreteAggregate(List<Object> list) {
        this.list = list;
    }

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
