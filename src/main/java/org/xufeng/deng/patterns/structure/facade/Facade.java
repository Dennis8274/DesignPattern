package org.xufeng.deng.patterns.structure.facade;

/**
 * Created by deng.xufeng(一乐) on 2017/6/16.
 * <p>
 *
 * @author deng.xufeng
 */
public class Facade {
    private ServiceA serviceA;
    private ServiceB serviceB;

    public Facade() {
        serviceA = new ServiceImplA();
        serviceB = new ServiceImplB();
    }

    public void methodA(){
        serviceA.methodA();
        System.out.println("Say Something");
    }

    public void methodB(){
        serviceB.methodB();
        System.out.println("Say Another Thing");
    }

    public void service(){
        serviceA.methodA();
        serviceB.methodB();
    }
}
