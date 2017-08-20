package org.xufeng.deng.patterns.structure.flyweight;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    //不用维护享元对象的内部状态

    public void operate() {
        System.out.println("指向动作--un flyweight");
    }
}
