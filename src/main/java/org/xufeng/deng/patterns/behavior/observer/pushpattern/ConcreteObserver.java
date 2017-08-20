package org.xufeng.deng.patterns.behavior.observer.pushpattern;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteObserver implements Observer {
    private String newState;

    public void update(String newState) {
        this.newState = newState;
        System.out.println("observer update state");
    }
}
