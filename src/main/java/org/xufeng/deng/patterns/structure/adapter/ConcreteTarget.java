package org.xufeng.deng.patterns.structure.adapter;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>具体实现类
 *
 * @author deng.xufeng
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("普通类，只具有普通功能");
    }
}
