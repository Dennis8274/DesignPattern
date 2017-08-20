package org.xufeng.deng.patterns.behavior.iterator;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();
}
