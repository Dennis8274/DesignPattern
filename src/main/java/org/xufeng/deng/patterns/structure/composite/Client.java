package org.xufeng.deng.patterns.structure.composite;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Component component = new ParentComposite();
        component.sayName();
    }
}
