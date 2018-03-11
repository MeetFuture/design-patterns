package com.tangqiang.behavior.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 原发器创建一个备忘录,用以记录当前时刻它的内部状态。
 * 使用备忘录恢复内部状态.
 *
 * @author tangqiang
 */
public class Originator {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void showState() {
        logger.info("Originator state:" + state);
    }
}
