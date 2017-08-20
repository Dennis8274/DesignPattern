package org.xufeng.deng.patterns.structure.facade;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.methodA();
        System.out.println("======================");
        facade.methodB();
        System.out.println("======================");
        facade.service();
        System.out.println("======================");
    }
}
