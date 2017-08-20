package org.xufeng.deng.patterns.creation.abstractfactory;

/**
 * Created by deng.xufeng(一乐) on 2017/4/26.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public class ProductB2 implements ProductB {

    public ProductB2(){
        System.out.println("B2类产品构造");
    }

    public void executeB() {
        System.out.println("B2类产品执行动作");
    }
}
