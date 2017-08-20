package org.xufeng.deng.patterns.behavior.chainofresponsibility;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class KidsHandler extends Handler {
    public void doHandler() {
        System.out.println("Kids handler");
        if (getNextHandler()!=null){
            getNextHandler().doHandler();
        }
    }
}
