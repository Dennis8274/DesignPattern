package org.xufeng.deng.patterns.behavior.observer.pullpattern;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public abstract class Subject {
    private List<Observer> list = Lists.newArrayList();

    public void attach(Observer observer){
        list.add(observer);
    }

    public void detach(Observer observer){
        list.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer:list){
            observer.update(this);
        }
    }

    public abstract String getState();

    public abstract void change(String newState);

}
