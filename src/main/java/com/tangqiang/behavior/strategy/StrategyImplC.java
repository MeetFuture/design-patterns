package com.tangqiang.behavior.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 以Strategy接口实现某具体算法
 *
 * @author tangqiang
 */
public class StrategyImplC extends Strategy {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void method() {
        logger.info("这是第三个实现");
    }
}
