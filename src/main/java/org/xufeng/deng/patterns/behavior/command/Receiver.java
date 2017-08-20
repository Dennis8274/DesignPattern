package org.xufeng.deng.patterns.behavior.command;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class Receiver {
    public void action(){
        System.out.println("执行命令");
    }

    public void unDo(){
        System.out.println("撤销命令");
    }
}
