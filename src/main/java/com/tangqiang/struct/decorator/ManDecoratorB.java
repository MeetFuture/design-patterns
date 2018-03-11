package com.tangqiang.struct.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 向组件添加职责。
 *
 * @author tangqiang
 */
public class ManDecoratorB extends Decorator {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void eat() {
        logger.info("===============");
        logger.info("ManDecoratorB类");
        super.eat();
    }
}

