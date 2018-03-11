package com.tangqiang.creator.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WhiteCat 实现
 * 定义一个将被相应的具体工厂创建的产品对象。
 * 实现AbstractProduct接口。
 *
 * @author tangqiang
 */
public class WhiteCat implements ICat {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void eat() {
        logger.info("The white cat is eating!");
    }

}
