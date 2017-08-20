package org.xufeng.deng.patterns.creation.builder;

/**
 * Created by deng.xufeng(一乐) on 2017/4/27.
 * <p>
 *
 * @author deng.xufeng
 */
@SuppressWarnings("unused")
public abstract class Product {

    //some properties
    private String something;

    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    public String getSomething(){
        return this.something;
    }

    public void setSomething(String something){
        this.something = something;
    }

    public void execute(){
        System.out.println("something:"+this.getSomething()+"\n"+"another:"+this.getAnother());
    }

}
