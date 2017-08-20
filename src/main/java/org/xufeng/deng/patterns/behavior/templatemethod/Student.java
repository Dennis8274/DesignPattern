package org.xufeng.deng.patterns.behavior.templatemethod;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class Student extends Person {
    protected void go() {
        System.out.println("开车去学校");
    }

    protected void eatBreakfast() {
        System.out.println("吃妈妈做的早餐");
    }

    protected void dressUp() {
        System.out.println("穿校服");
    }
}
