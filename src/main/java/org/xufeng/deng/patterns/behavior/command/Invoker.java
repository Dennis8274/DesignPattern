package org.xufeng.deng.patterns.behavior.command;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void runCommand(){
        command.execute();
    }

    public void unDoCommand(){
        command.unDo();
    }
}
