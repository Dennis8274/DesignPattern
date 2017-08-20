package org.xufeng.deng.patterns.behavior.state;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p> ConcreteState
 *
 * @author deng.xufeng
 */
public class Sunshine implements State {
    @Override
    public String getState() {
        return "sunshine";
    }
}
