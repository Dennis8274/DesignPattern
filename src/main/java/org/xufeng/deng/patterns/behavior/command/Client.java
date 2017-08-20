package org.xufeng.deng.patterns.behavior.command;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class Client {
    public static void main(String[] args){
        Command command = new CreateCommand().createCommand(new ConcreteCommand(new Receiver()));
        Invoker invoker = new Invoker(command);
        invoker.runCommand();
        invoker.unDoCommand();
    }
}
