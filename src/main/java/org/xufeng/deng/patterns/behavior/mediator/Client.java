package org.xufeng.deng.patterns.behavior.mediator;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Colleague colleagueA = new ConcreteColleagueA(10);
        Colleague colleagueB = new ConcreteColleagueB(0);

        Mediator mediator = new ConcreteMediator(colleagueA,colleagueB);
        colleagueA.executeNumber(mediator);
        System.out.println(colleagueA.getNumber());
        System.out.println(colleagueB.getNumber());
    }
}
