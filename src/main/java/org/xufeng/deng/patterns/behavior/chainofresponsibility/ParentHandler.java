package org.xufeng.deng.patterns.behavior.chainofresponsibility;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ParentHandler extends Handler {
    public void doHandler() {
        System.out.println("parent handler");
        if (getNextHandler() != null) {
            getNextHandler().doHandler();
        }
    }
}
