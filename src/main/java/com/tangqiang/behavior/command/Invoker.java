package com.tangqiang.behavior.command;

/**
 * 要求该命令执行这个请求
 *
 * @author tangqiang
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
