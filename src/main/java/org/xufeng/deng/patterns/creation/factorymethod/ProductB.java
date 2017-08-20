package org.xufeng.deng.patterns.creation.factorymethod;

/**
 * Created by deng.xufeng(一乐) on 2017/4/28.
 * <p>
 *
 * @author deng.xufeng
 */
public class ProductB implements Product{

    public void executeB(){
        System.out.println("Product execute b!!!");
    }

    public void execute() {
        System.out.println("ProductB execute!!!");
    }
}
