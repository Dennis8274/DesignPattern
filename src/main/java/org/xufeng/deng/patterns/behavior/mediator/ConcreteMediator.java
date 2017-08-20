package org.xufeng.deng.patterns.behavior.mediator;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteMediator extends AbstractMediator {
    public ConcreteMediator(Colleague colleagueA, Colleague colleagueB) {
        super(colleagueA, colleagueB);
    }

    public void AAffectB() {
        int number = colleagueA.getNumber();
        colleagueB.setNumber(number*10);
    }

    public void BAffectA() {
        Integer number = colleagueB.getNumber();
        colleagueA.setNumber(number/10);
    }
}
