package org.xufeng.deng.patterns.behavior.visitor;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteElementSyo implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void doSomething() {
        System.out.println("Syo do something");
    }
}
