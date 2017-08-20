package org.xufeng.deng.patterns.creation.prototype.deep;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>
 *
 * @author deng.xufeng
 */
public class DeepPrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setName("originalName");
        NewDeepPrototype newDeepPrototype = new NewDeepPrototype();
        newDeepPrototype.setId("originalId");
        newDeepPrototype.setDeepPrototype(deepPrototype);

        NewDeepPrototype copyPrototype = (NewDeepPrototype)newDeepPrototype.clone();
        System.out.println(copyPrototype);
    }
}
