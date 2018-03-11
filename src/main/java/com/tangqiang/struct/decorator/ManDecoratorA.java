package com.tangqiang.struct.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 向组件添加职责。
 *
 * @author tangqiang
 */
public class ManDecoratorA extends Decorator {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void eat() {
        logger.info("ManDecoratorA类");
        super.eat();
        reEat();
    }

    public void reEat() {
        logger.info("再吃一顿饭");
    }
}

