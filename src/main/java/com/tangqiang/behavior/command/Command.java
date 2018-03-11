package com.tangqiang.behavior.command;

/**
 * 声明执行操作的接口
 *
 * @author tangqiang
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}

