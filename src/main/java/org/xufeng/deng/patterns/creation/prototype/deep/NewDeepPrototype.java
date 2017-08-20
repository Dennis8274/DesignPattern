package org.xufeng.deng.patterns.creation.prototype.deep;

/**
 * Created by deng.xufeng(一乐) on 2017/4/29.
 * <p>
 *
 * @author deng.xufeng
 */
public class NewDeepPrototype implements Cloneable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private DeepPrototype deepPrototype;

    public DeepPrototype getDeepPrototype() {
        return deepPrototype;
    }

    public void setDeepPrototype(DeepPrototype deepPrototype) {
        this.deepPrototype = deepPrototype;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NewDeepPrototype{" +
                "id='" + id + '\'' +
                ", deepPrototype=" + deepPrototype +
                '}';
    }
}
