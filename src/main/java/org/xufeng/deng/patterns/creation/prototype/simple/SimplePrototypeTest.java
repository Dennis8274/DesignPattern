package org.xufeng.deng.patterns.creation.prototype.simple;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>浅拷贝
 *
 * @author deng.xufeng
 */
public class SimplePrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        SimplePrototype simplePrototype = new SimplePrototype();
        simplePrototype.setName("originalName");

        NewSimplePrototype newSimplePrototype = new NewSimplePrototype();
        newSimplePrototype.setSimplePrototype(simplePrototype);
        newSimplePrototype.setId("originalId");

        NewSimplePrototype copySimplePrototype = (NewSimplePrototype) newSimplePrototype.clone();
        copySimplePrototype.setId("copyId");
        copySimplePrototype.getSimplePrototype().setName("copyName");
        System.out.println("copy:"+copySimplePrototype);
    }
}
