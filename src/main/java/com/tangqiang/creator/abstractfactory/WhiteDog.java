package com.tangqiang.creator.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WhiteDog 实现
 * 定义一个将被相应的具体工厂创建的产品对象。
 * 实现AbstractProduct接口。
 *
 * @author tangqiang
 */
public class WhiteDog implements IDog {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void eat() {
        logger.info("白狗吃东西!");
    }

}
