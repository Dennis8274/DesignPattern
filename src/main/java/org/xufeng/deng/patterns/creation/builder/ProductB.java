package org.xufeng.deng.patterns.creation.builder;

/**
 * Created by deng.xufeng(一乐) on 2017/4/27.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ProductB extends Product {

    public void execute() {
        System.out.println("something:"+this.getSomething()+"\n"+"another:"+this.getAnother()+"\nProductB execute！！！");
    }
}
