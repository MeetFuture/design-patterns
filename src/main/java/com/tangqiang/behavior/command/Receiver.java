package com.tangqiang.behavior.command;

/**
 * 将一个接收者对象绑定于一个动作。
 * 调用接收者相应的操作，以实现Execute。
 *
 * @author tangqiang
 */
public class Receiver {

    public void execute() {
        System.out.println("This is Receive class!");
    }

}
