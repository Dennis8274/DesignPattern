package org.xufeng.deng.patterns.creation.builder;

/**
 * Created by deng.xufeng(一乐) on 2017/4/27.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Director productADirector = new ProductADirector();
        Director productBDirector = new ProductBDirector();
        Product productA = productADirector.constructProduct(new ProductABuilder());
        Product productB = productBDirector.constructProduct(new ProductBBuilder());

        productA.execute();
        productB.execute();
    }
}
