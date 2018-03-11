package com.tangqiang.struct.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定义一个对象，可以给这个对象添加一些职责
 *
 * @author tangqiang
 */
public class Man implements Person {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void eat() {
        logger.info("男人在吃");
    }
}

