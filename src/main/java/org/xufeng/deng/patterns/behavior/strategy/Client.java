package org.xufeng.deng.patterns.behavior.strategy;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Context context = new Context(new ConcreteStrategyOne());
        context.executeStrategy();
        context.setStrategy(new ConcreteStrategyTwo());
        context.executeStrategy();
    }
}
