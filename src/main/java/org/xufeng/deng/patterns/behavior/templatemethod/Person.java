package org.xufeng.deng.patterns.behavior.templatemethod;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>AbstractClazz
 *
 * @author deng.xufeng
 */
public abstract class Person {
    public void goSchool(){
        dressUp();//穿衣服
        eatBreakfast();//吃早饭
        go();//去学校路上
    }

    protected abstract void go();

    protected abstract void eatBreakfast();

    protected abstract void dressUp();

}
