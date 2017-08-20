package org.xufeng.deng.patterns.structure.bridge;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>
 *
 * @author deng.xufeng
 */
public class TerranImplementor implements Implementor {
    public void operationImpl(Abstraction abstraction) {
        System.out.println("地球人"+abstraction.operate());
    }
}
