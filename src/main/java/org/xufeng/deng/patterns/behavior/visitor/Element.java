package org.xufeng.deng.patterns.behavior.visitor;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public interface Element {
    void accept(Visitor visitor);
    void doSomething();
}
