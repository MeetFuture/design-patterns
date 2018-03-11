package com.tangqiang.behavior.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ConcreteSubject（具体目标）
 * 将有关状态存入各ConcreteObserver对象。
 * 当它的状态发生改变时,向它的各个观察者发出通知。
 *
 * @author tangqiang
 */
public class TianHeCitizen extends Citizen {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void sendMessage(String help) {
        logger.info("TianHeCitizen.sendMessage :" + help);
        setHelp(help);
        for (int i = 0; i < pols.size(); i++) {
            Policeman pol = pols.get(i);
            //通知警察行动
            pol.action(this);
        }
    }

}
