package org.xufeng.deng.patterns.behavior.iterator;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list;
    private int cursor = 0;//游标

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }


    public boolean hasNext() {
        return !(cursor == list.size());
    }

    public Object next() {
        if (hasNext()){
            return list.get(cursor++);
        }
        return null;
    }
}
