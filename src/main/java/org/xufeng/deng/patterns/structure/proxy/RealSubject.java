package org.xufeng.deng.patterns.structure.proxy;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class RealSubject implements Subject {
    public void action() {
        System.out.println("被代理的实体类");
    }
}
