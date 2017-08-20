package org.xufeng.deng.patterns.behavior.visitor;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteVisitor implements Visitor {
    public void visit(Element element) {
        element.doSomething();
    }
}
