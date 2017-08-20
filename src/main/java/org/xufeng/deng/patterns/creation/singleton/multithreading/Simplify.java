package org.xufeng.deng.patterns.creation.singleton.multithreading;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class Simplify {
    private Simplify(){
    }

    public static Simplify getInstance(){
        return NestedSimply.singleton;
    }

    private static class NestedSimply{
        private static Simplify singleton = new Simplify();
    }

}
