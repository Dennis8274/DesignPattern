package org.xufeng.deng.patterns.structure.flyweight;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteFlyweight implements Flyweight {
    private boolean status; //或者是内部状态对象

    public void operate() {
        System.out.println("执行动作--flyweight");
    }
}
