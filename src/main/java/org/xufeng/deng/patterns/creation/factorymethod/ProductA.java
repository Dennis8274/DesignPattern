package org.xufeng.deng.patterns.creation.factorymethod;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
public class ProductA implements Product {

    public void executeA(){
        System.out.println("Product execute A!!!");
    }

    public void execute() {
        System.out.println("ProductA execute!!!");
    }
}
