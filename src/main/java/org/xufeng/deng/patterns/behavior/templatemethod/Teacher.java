package org.xufeng.deng.patterns.behavior.templatemethod;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class Teacher extends Person {
    protected void go() {
        System.out.println("坐小车去学校");
    }

    protected void eatBreakfast() {
        System.out.println("做早餐给自己吃");
    }

    protected void dressUp() {
        System.out.println("穿工作服");
    }
}
