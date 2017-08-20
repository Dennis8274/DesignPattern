package org.xufeng.deng.patterns.behavior.strategy;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.operate();
    }
}
