package com.tangqiang.creator.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BlackDog 实现
 * 定义一个将被相应的具体工厂创建的产品对象。
 * 实现AbstractProduct接口。
 *
 * @author tangqiang
 */
public class BlackDog implements IDog {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void eat() {
        logger.info("黑狗吃东西！");
    }

}
