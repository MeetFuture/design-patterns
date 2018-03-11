package com.tangqiang.behavior.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 将一个接收者对象绑定于一个动作。
 * 调用接收者相应的操作，以实现Execute。
 *
 * @author tangqiang
 */
public class Receiver {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void execute() {
        logger.info("This is Receive class!");
    }

}
