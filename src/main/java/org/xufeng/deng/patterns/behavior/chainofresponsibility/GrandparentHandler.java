package org.xufeng.deng.patterns.behavior.chainofresponsibility;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class GrandparentHandler extends Handler {
    public void doHandler() {
        System.out.println("grandparent handler");
        if (getNextHandler() != null) {
            getNextHandler().doHandler();
        }
    }
}
