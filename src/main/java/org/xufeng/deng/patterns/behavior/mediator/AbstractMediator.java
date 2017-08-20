package org.xufeng.deng.patterns.behavior.mediator;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public abstract class AbstractMediator implements Mediator {
    protected Colleague colleagueA;
    protected Colleague colleagueB;

    public AbstractMediator(Colleague colleagueA, Colleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void AAffectB();

    public abstract void BAffectA();
}
