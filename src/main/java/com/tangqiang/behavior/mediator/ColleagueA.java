package com.tangqiang.behavior.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 每一个同事类都知道它的中介者对象。
 * 每一个同事对象在需与其他的同事通信的时候，与它的中介者通信
 *
 * @author tangqiang
 */
public class ColleagueA implements Colleague {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void action() {
        logger.info("action普通员工:努力工作");
    }
}

