package org.xufeng.deng.patterns.behavior.observer.pullpattern;


/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Observer observer = new ConcreteObserver();
        Subject subject = new ConcreteSubject();
        subject.attach(observer);
        subject.change("new state");
    }
}
