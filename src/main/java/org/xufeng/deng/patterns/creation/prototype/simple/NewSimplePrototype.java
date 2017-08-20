package org.xufeng.deng.patterns.creation.prototype.simple;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>
 *
 * @author deng.xufeng
 */
public class NewSimplePrototype implements Cloneable {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private SimplePrototype simplePrototype;

    public SimplePrototype getSimplePrototype() {
        return simplePrototype;
    }

    public void setSimplePrototype(SimplePrototype simplePrototype) {
        this.simplePrototype = simplePrototype;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NewSimplePrototype{" +
                "id=" + id +
                ", simplePrototype=" + simplePrototype +
                '}';
    }
}
