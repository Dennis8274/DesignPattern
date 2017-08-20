package org.xufeng.deng.patterns.structure.decorator;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {

    public static void main(String[] args){
        Component decorator = new ConcreteDecorator(new AnotherConcreteDecorator(new ConcreteComponent()));
        decorator.sayName();
    }
}
