package org.xufeng.deng.patterns.behavior.command;

/**
 * Created by deng.xufeng(一乐) on 2017/7/5.
 * <p>
 *
 * @author deng.xufeng
 */
public class CreateCommand{
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command createCommand(Command command){
        if (this.command==null){
            this.command = command;
        }
        return this.command;
    }
}
