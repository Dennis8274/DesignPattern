package org.xufeng.deng.patterns.structure.flyweight;

/**
 * Created by deng.xufeng(一乐) on 2017/6/17.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("test");
        flyweight1.operate();

        Flyweight flyweight2 = FlyweightFactory.getFlyweight("halo");
        flyweight2.operate();
    }
}
