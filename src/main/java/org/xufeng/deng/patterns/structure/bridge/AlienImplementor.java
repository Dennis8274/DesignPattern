package org.xufeng.deng.patterns.structure.bridge;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>
 *
 * @author deng.xufeng
 */
public class AlienImplementor implements Implementor {
    public void operationImpl(Abstraction abstraction) {
        System.out.println("外星人"+abstraction.operate());
    }
}
