package org.xufeng.deng.patterns.creation.abstractfactory;

/**
 * Created by deng.xufeng(一乐) on 2017/4/26.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ProductA1 implements ProductA {

    public ProductA1(){
        System.out.println("A1类产品构造");
    }

    public void executeA() {
        System.out.println("A1 类产品执行动作");
    }
}
