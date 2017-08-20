package org.xufeng.deng.patterns.behavior.chainofresponsibility;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        GrandparentHandler grandparentHandler = new GrandparentHandler();
        ParentHandler parentHandler = new ParentHandler();
        KidsHandler kidsHandler = new KidsHandler();
        grandparentHandler.setNextHandler(parentHandler);
        parentHandler.setNextHandler(kidsHandler);

        grandparentHandler.doHandler();
    }
}
