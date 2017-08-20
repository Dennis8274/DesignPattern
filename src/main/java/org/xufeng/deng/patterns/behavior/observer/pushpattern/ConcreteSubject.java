package org.xufeng.deng.patterns.behavior.observer.pushpattern;


/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteSubject extends Subject {
    private String state;

    public void change(String newState){
        this.state = newState;
        this.notifyObservers(newState);
    }

    public String getState() {
        return this.state;
    }
}
