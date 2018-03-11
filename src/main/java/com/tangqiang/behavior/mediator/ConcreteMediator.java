package com.tangqiang.behavior.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体中介者通过协调各同事对象实现协作行为。
 * 了解并维护它的各个同事。
 *
 * @author tangqiang
 */
public class ConcreteMediator extends Mediator {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Colleague ca;
    private Colleague cb;

    public ConcreteMediator() {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        logger.info("notice:" + content);
        if (content.equals("boss")) {
            //老板来了, 通知员工A
            ca.action();
        }
        if (content.equals("client")) {
            //客户来了, 通知前台B
            cb.action();
        }
    }

}
