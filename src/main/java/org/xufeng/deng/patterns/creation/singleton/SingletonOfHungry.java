package org.xufeng.deng.patterns.creation.singleton;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class SingletonOfHungry {
    private  SingletonOfHungry(){
    }

    private static SingletonOfHungry singletonOfHungry;

    public static synchronized  SingletonOfHungry getInstance(){
        if (null == singletonOfHungry){
            return new SingletonOfHungry();
        }

        return singletonOfHungry;
    }
}
