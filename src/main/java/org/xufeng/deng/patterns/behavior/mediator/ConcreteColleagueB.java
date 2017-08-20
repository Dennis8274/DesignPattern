package org.xufeng.deng.patterns.behavior.mediator;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Integer number) {
        super(number);
    }

    public void executeNumber(Mediator mediator) {
        mediator.BAffectA();
    }
}
