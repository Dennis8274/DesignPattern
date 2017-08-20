package org.xufeng.deng.patterns.creation.singleton;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class SingletonOfCloy {
    private SingletonOfCloy(){
    }

    private static SingletonOfCloy singletonOfCloy = new SingletonOfCloy();

    public static SingletonOfCloy getInstance(){
        return singletonOfCloy;
    }
}
