package org.xufeng.deng.patterns.behavior.mediator;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public abstract class Colleague {
    protected Integer number;

    public Colleague(Integer number) {
        this.number = number;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public abstract void executeNumber(Mediator mediator);
}
