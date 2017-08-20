package org.xufeng.deng.patterns.behavior.mediator;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Integer number) {
        super(number);
    }

    public void executeNumber(Mediator mediator) {
        mediator.AAffectB();
    }
}
