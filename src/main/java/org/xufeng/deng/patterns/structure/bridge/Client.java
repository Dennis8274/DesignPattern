package org.xufeng.deng.patterns.structure.bridge;

/**
 * Created by deng.xufeng(一乐) on 2017/6/15.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Implementor terran = new TerranImplementor();
        terran.operationImpl(new BetterRefinedAbstraction());

        Implementor alien = new AlienImplementor();
        alien.operationImpl(new WorseRefinedAbstraction());
    }
}
