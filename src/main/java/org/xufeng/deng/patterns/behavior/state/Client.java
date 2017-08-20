package org.xufeng.deng.patterns.behavior.state;

/**
 * Created by deng.xufeng(一乐) on 2017/7/6.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Context context = new Context();
        context.setState(new Sunshine());
        System.out.println(context.getState().getState());
    }
}
