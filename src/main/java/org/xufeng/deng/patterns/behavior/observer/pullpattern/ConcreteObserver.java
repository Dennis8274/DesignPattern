package org.xufeng.deng.patterns.behavior.observer.pullpattern;


/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteObserver implements Observer {
    private String observerState;
    public void update(Subject subject) {
        this.observerState = subject.getState();
        System.out.println("concrete observer changed and updated");
    }
}
